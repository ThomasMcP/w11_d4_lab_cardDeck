public enum ResultType {
    PLAYERONEWIN("Congratulations Player 1, you've won!"),
    PLAYERTWOWIN("Congratulations Player 2, you've won!"),
    TIE("You tied!");

    private final String resultString;

    ResultType(String winString) {
        this.resultString = winString;
    }
}
