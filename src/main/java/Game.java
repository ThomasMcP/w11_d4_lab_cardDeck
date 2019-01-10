import java.util.ArrayList;

public class Game {
    private ArrayList<Player> playerList;
    private Deck deck;

    public Game(ArrayList<Player> playerList) {
        this.playerList = playerList;
        this.deck = new Deck();
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public Deck getDeck() {
        return deck;
    }

    public ResultType establishWinner() {
        ResultType result;
        int player1Value = playerList.get(0).getCard().getRank().getValue();
        int player2Value = playerList.get(1).getCard().getRank().getValue();
        if (player1Value > player2Value) {
            result = ResultType.PLAYERONEWIN;
        } else if (player2Value > player1Value) {
            result = ResultType.PLAYERTWOWIN;
        } else {
            result = ResultType.TIE;
        }
        return result;
    }


    public ResultType playRound() {
        dealToPlayers();
        ResultType winType = establishWinner();
        return winType;
    }

    public void dealToPlayers() {
        deck.shuffleDeck();
        for (Player player : playerList) {
            deck.dealACard(player);
        }
    }

    public void recoverCardsDealt() {
        for (Player player : playerList) {
            deck.addCard(player.returnCard());
        }
    }
}
