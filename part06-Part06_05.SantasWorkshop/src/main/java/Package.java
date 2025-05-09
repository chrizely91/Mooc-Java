
import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts = new ArrayList<>();


    public void addGift(Gift gift) {
        gifts.add(gift);
    }


    public int totalWeight() {
        int tWeight = 0;

        for (Gift gift : this.gifts) {
            tWeight += gift.getWeight();
        }

        return tWeight;
    }

}
