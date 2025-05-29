
public class Card implements Comparable<Card> {

    private int value;
    private Suit suit;  

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }


    public Suit getSuit() {
        return this.suit;
    }

    public int getValue() {
        return this.value;
    }


    @Override
    public String toString() {
        String cardValue = "" + value;
        if(value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }
        
        return suit + " " + cardValue;
    }

    @Override
    public int compareTo(Card other) {
        if(this.value != other.value) {
            return this.value - other.value;
        }
        return this.suit.ordinal() - other.getSuit().ordinal();
    }

}
