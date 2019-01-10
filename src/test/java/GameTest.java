import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Player player1;
    private Player player2;
    private Game game;
    private ArrayList<Player> playerList;


    @Before
    public void setUp() throws Exception {
        player1 = new Player("Thomas McPhee");
        player2 = new Player("Rob Wilson");
        playerList = new ArrayList<>();
        playerList.add(player1);
        playerList.add(player2);

        this.game = new Game(playerList);
    }

    @Test
    public void shouldHavePlayers() {
        assertEquals(playerList, game.getPlayerList());
    }

    @Test
    public void shouldHaveDeck() {
        assertEquals(52, game.getDeck().getDeckSize());
    }

    @Test
    public void canPlayARound() {
        game.playRound();
    }

    @Test
    public void canDealToPlayers() {
        game.dealToPlayers();
        assertEquals(50, game.getDeck().getDeckSize());
    }

    @Test
    public void canRecoverCardsFromPlayers() {
        game.dealToPlayers();
        assertEquals(50, game.getDeck().getDeckSize());
        game.recoverCardsDealt();
        assertEquals(52, game.getDeck().getDeckSize());
    }
}
