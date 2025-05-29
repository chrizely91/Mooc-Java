import java.util.ArrayList;

public class Stack {
    private ArrayList<String> values = new ArrayList<>();

    public Stack() {
        this.values = new ArrayList<>();
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }


    public void add(String value) {
        values.add(value);
    }


    public ArrayList<String> values() {
        return values;
    }

    public String take() {
        String taken = values.get(values.size() - 1);

        values.remove(values.size() - 1);

        return taken;
        
        
    }

}
