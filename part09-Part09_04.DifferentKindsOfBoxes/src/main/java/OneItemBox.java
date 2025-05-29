public class OneItemBox extends Box {
    private Item item;

    public OneItemBox() {
        this.item = null;

    }

    @Override
    public void add(Item item) {
        if (this.item == null) {
            this.item = item;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.item != null && this.item.equals(item);
    }
}
