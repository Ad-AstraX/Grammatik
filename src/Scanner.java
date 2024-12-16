public class Scanner {

    public List<Token> scan(String word) {
        List<Token> tokenList = new List<>();

        for (char character : word.toCharArray()) {
            switch (character) {
                case 'w', 'b' -> tokenList.append(new Token(character, Token.type.BEHAELTNIS));
                case 'v', 'e', 'p' -> tokenList.append(new Token(character, Token.type.SORTE));
                case 's', 'z' -> tokenList.append(new Token(character, Token.type.TOPPING));
                default -> { return new List<>(); }
            }
        }
        return tokenList;
    }

    public void listToString(List<Token> tokenList) {
        tokenList.toFirst();
        while (tokenList.hasAccess()) {
            System.out.println(tokenList.getContent().typ + ": " + tokenList.getContent().wert);
            tokenList.next();
        }
    }
}
