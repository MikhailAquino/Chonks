import java.util.ArrayList;
import java.util.List;

public class LexicalAnalyzer {
    private static final List<String> keywords = List.of("ask", "call", "chunk", "end", "flag",
            "num", "show", "start", "tic", "txt", "delay", "loc", "ret", "swap", "cycle", "toggle");
    private static final List<String> operators = List.of("=", "+=", "-=", "*=", "/=", "%=", "~=",
            "+", "-", "*", "/", "%", "*^", "&&", "||", "!", "==", "!=", "<", ">", "<=", ">=");
    private static final List<Character> delimiters = List.of(';', '{', '}', '(', ')', '[', ']', ',');

    public static List<Lexeme> analyze(String input) {
        List<Lexeme> lexemes = new ArrayList<>();
        int i = 0;

        while (i < input.length()) {
            char current = input.charAt(i);

            // Skip whitespaces
            if (Character.isWhitespace(current)) {
                i++;
                continue;
            }

            // Check for identifiers or keywords
            if (Character.isLetter(current)) {
                StringBuilder builder = new StringBuilder();
                while (i < input.length() && (Character.isLetterOrDigit(input.charAt(i)) || input.charAt(i) == '_')) {
                    builder.append(input.charAt(i++));
                }
                String word = builder.toString();
                if (keywords.contains(word)) {
                    lexemes.add(new Lexeme(word, Token.KEYWORD));
                } else {
                    lexemes.add(new Lexeme(word, Token.IDENTIFIER));
                }
                continue;
            }

            // Check for numbers
            if (Character.isDigit(current)) {
                StringBuilder builder = new StringBuilder();
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    builder.append(input.charAt(i++));
                }
                lexemes.add(new Lexeme(builder.toString(), Token.NUMERIC_LITERAL));
                continue;
            }

            // Check for operators
            if (isOperatorStart(current)) {
                StringBuilder builder = new StringBuilder();
                while (i < input.length() && isOperatorCharacter(input.charAt(i))) {
                    builder.append(input.charAt(i++));
                }
                String op = builder.toString();
                if (operators.contains(op)) {
                    lexemes.add(new Lexeme(op, Token.ARITHMETIC_OPERATOR));
                } else {
                    lexemes.add(new Lexeme(op, Token.ERROR));
                }
                continue;
            }

            // Handle string literals
            if (current == '"') {
                i++; // Skip the opening quote
                StringBuilder builder = new StringBuilder();
                while (i < input.length() && input.charAt(i) != '"') {
                    builder.append(input.charAt(i++));
                }
                if (i < input.length() && input.charAt(i) == '"') {
                    i++; // Skip the closing quote
                    lexemes.add(new Lexeme(builder.toString(), Token.STRING_LITERAL));
                } else {
                    lexemes.add(new Lexeme(builder.toString(), Token.ERROR)); // Unterminated string
                }
                continue;
            }

            // Handle comments
            if (current == '/' && i + 1 < input.length() && input.charAt(i + 1) == '/') {
                i += 2; // Skip "//"
                StringBuilder builder = new StringBuilder();
                while (i < input.length() && input.charAt(i) != '\n') {
                    builder.append(input.charAt(i++));
                }
                lexemes.add(new Lexeme(builder.toString(), Token.COMMENT));
                continue;
            }

            // Handle delimiters
            if (delimiters.contains(current)) {
                lexemes.add(new Lexeme(String.valueOf(current), Token.DELIMITER));
                i++;
                continue;
            }

            // Handle unknown character
            lexemes.add(new Lexeme(String.valueOf(current), Token.ERROR));
            i++;
        }

        return lexemes;
    }

    private static boolean isOperatorStart(char c) {
        return "+-*/%=&|!<>~".indexOf(c) != -1;
    }

    private static boolean isOperatorCharacter(char c) {
        return "+-*/%=&|!<>~^".indexOf(c) != -1;
    }
}