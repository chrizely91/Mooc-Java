
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (elements.isEmpty()) {
            return String.format("The collection %s is empty.", this.name);
        }
        
        String elementList = "";
        for (String element : elements) {
            elementList += "\n" + element;
        }
        
        
        if (elements.size() == 1) {
            return String.format("The collection %s has %d element:%s", this.name, elements.size(), elementList);
        } else {
            return String.format("The collection %s has %d elements:%s", this.name, elements.size(), elementList);
        }
    }
}
