public class Token {
    public char wert;
    public enum type {
        BEHAELTNIS,
        SORTE,
        TOPPING
    }

    public Token.type typ;

    public Token(char wert, Token.type typ) {
        this.wert = wert;
        this.typ = typ;
    }
}
