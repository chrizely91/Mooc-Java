public class Product {
    private final String name;
    private final double price;
    private final int quantity;


    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    public void printProduct() {
        System.out.printf("%s, price %s, %d pcs%n", name, price, quantity);
    }
}