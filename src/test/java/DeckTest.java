import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Player robWilson;
    private Deck deck;

    @Before
    public void setUp() {
        deck = new Deck();
        robWilson = new Player("Thomas McPhee");
    }

    @Test
    public void has52Cards() {
        assertEquals(52, deck.getDeckSize());
    }

    @Test
    public void canShuffle(){
        deck.shuffleDeck();
    }

    @Test
    public void canDeal(){
        deck.shuffleDeck();
        deck.dealACard(robWilson);
        assertEquals(51, deck.getDeckSize());
        assertEquals(1, robWilson.getHandSize());
    }
}
