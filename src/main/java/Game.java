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
}
