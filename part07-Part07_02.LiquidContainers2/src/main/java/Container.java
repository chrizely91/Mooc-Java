public class Container {
    private final int MAX = 100;
    private int liters;
    
    public int contains() {
        return this.liters;
    }


    public void add(int amount) {
        if (amount > 0) {
        liters = Math.min(liters + amount, MAX);
        }
    }


    public void remove(int amount) {
        if (amount > 0) {
            liters = Math.max(liters - amount, 0);
        }
    }

    public String toString() {
        return liters + "/" + MAX;
    }

}
