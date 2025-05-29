import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> itens;

    public MisplacingBox() {
        this.itens = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        this.itens.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
