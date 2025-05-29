
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;

    
    public Warehouse() {
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }


    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }


    public int price(String product) {
        if (prices.containsKey(product)) {
            return prices.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (stock.containsKey(product)) {
            return stock.get(product);  
        }
        return 0;
    }


    public boolean take(String product) {
        if (!stock.containsKey(product)) {
            return false; 
        }

        int currently = stock.getOrDefault(product, 0);

        if (currently <= 0) {
            return false;
        }

        stock.put(product, currently - 1);
        return true;
    }


    public Set<String> products() {

        return new HashSet<>(prices.keySet());
    }


}
