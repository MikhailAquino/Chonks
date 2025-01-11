import java.util.*;

public class Main extends LexicalAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your code (type 'END' to finish):");

        StringBuilder inputBuffer = new StringBuilder();
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("END")) {
                break;
            }
            inputBuffer.append(line).append("\n");
        }

        String inputCode = inputBuffer.toString();
        System.out.println("\nLexical Analysis Results:");
        List<Lexeme> lexemes = analyze(inputCode);

        for (Lexeme lexeme : lexemes) {
            System.out.println(lexeme);
        }

        scanner.close();
    }
}