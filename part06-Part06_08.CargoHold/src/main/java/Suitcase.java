
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }


    public void addItem(Item item) {
        if(totalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }        
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public int totalWeight() {
        int tweight = 0;

        for (Item item : items) {
            tweight += item.getWeight();
        }

        return tweight;
    }

    public Item heaviestItem() {
        if (!items.isEmpty()) {
            Item heaviest = items.get(0);

        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
            
        }

        return null;
    }


    public String toString() {
        int tweight = this.totalWeight();
        int itemsSize = items.size();

        switch (itemsSize) {
            case 0:
                return "no items (0 kg)";
            case 1:
                return 1 + " item (" + tweight + " kg)";
            default:
                return itemsSize + " items (" + tweight + " kg)";   
        }
    }
}
