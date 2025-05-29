import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory(){
        this.history = new ArrayList<>();
    };

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }


    public double maxValue() {
        double max = history.get(0);
        for (double value : history) {
            if (value > max) max = value;
        }

        return max;
    }

    public double minValue() {
        double min = history.get(0);
        for (double value : history) {
            if (value < min) min = value;
        }

        return min;
    }

    public double average() {
        double total = 0;
        if (history.isEmpty()) return 0.0;

        for (double value : history) {
            total += value;
        }

        return total / history.size();
    }
    
    @Override
    public String toString() {
        return history.toString();
    }



}
