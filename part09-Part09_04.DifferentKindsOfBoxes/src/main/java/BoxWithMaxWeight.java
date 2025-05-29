
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> itens;
    private int maxWeight;
    

    public BoxWithMaxWeight(int capacity) {
        this.itens = new ArrayList<>();
        this.maxWeight = capacity;  
    }

    @Override
    public void add(Item item) {
        int currentWeight = 0;
        for (Item it : this.itens) {
            currentWeight += it.getWeight();
        }

        if ((item.getWeight() + currentWeight) > maxWeight) return;
        this.itens.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return itens.contains(item);
    }

}
