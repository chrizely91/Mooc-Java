
import java.util.ArrayList;
import java.util.List;

public class Box implements Packable {
    private List<Packable> items;
    private double capacity;

    public Box(double capacity) {
        items = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= capacity) {
            items.add(item);
        }
    }    

    @Override
    public double weight() {
        double total = 0.0;
        for (Packable item : items) {
            total += item.weight();
        }

        return total;
    }

    @Override
    public String toString() {
        return ("Box: " + this.items.size() + " items, total weight " + String.valueOf(this.weight()).replace(',', '.') + " kg");
    }

}
