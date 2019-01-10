import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    
    private ArrayList<Card> cards;
    
    public Deck() {
        this.cards = new ArrayList<>();
        this.cards = populateDeck();
    }

    private ArrayList<Card> populateDeck() {
        ArrayList<Card> pack = new ArrayList<>();
       for (SuitType suit: SuitType.values()) {
           for (RankType rank: RankType.values()){
               Card card = new Card(suit, rank);
               pack.add(card);
           }
       }
       return pack;
    }

    public int getDeckSize() {
        return this.cards.size();
    }

    public void shuffleDeck(){
        Collections.shuffle(this.cards);
    }

    public void dealACard(Player player) {
        Card dealtCard = this.cards.remove(0);
        player.addCard(dealtCard);
    }

    public void addCard(Card returnedCard) {
        this.cards.add(returnedCard);
    }
}
