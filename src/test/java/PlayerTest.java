import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card;

    @Before
    public void setUp() {
        player = new Player("Malcolm");
        card = new Card(SuitType.SPADES, RankType.ACE);
    }

    @Test
    public void hasName() {
        assertEquals("Malcolm", player.getName());
    }

    @Test
    public void hasEmptyHand() {
        assertEquals(0, player.getHandSize());
    }

    @Test
    public void canGetCard() {
        player.addCard(card);
        assertEquals(1, player.getHandSize());
        assertEquals(card, player.getCard());
    }

    @Test
    public void playerCanLoseCard() {
        player.addCard(card);
        assertEquals(1, player.getHandSize());
        player.returnCard();
        assertEquals(0, player.getHandSize());
    }
}
