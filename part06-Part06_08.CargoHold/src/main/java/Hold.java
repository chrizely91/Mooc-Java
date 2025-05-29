
import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    private int maxWeight;


    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }


    public void addSuitcase(Suitcase suitcase) {
        int tweight = 0;

        for (Suitcase suit : this.suitcases) {
            tweight += suit.totalWeight();
        }

        if (tweight + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }

    }  

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        int total = 0;
        for (Suitcase suitcase : this.suitcases) {
            total += suitcase.totalWeight();
        }

        return String.format("%d suitcases (%d kg)", suitcases.size(), total);
    }

}
