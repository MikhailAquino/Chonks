public class Lexeme {
    private final String value;
    private final Token token;

    public Lexeme(String value, Token token) {
        this.value = value;
        this.token = token;
    }

    public String getValue() {
        return value;
    }

    public Token getToken() {
        return token;
    }

    @Override
    public String toString() {
        return "Lexeme{" +
                "value='" + value + '\'' +
                ", token=" + token +
                '}';
    }
}