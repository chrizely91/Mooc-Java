import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    public int compare(Card one, Card other) {
        if (one.getSuit() != other.getSuit()) {
        return one.getSuit().ordinal() - other.getSuit().ordinal();
    }
    return one.getValue() - other.getValue();
}

}
