public class Organism implements Movable {
    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public String toString() {
        return String.format("x: %d; y: %d", x, y);
    }


    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

}
