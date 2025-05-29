
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (this == anotherObject) return true;

        if (!(anotherObject instanceof Item)) return false;

        Item comparedItem = (Item) anotherObject;

        return this.name.equals(comparedItem.name);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int hash = 19;
        return prime * hash * this.name.hashCode();
    }
    

}
