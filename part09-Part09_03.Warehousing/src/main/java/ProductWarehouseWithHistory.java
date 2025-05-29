

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        this.history.add(initialBalance);
    }

    
    public String history() {
        return this.history.toString();

    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(super.getBalance());
    }


    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        history.add(super.getBalance());
        
        return taken;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}
 