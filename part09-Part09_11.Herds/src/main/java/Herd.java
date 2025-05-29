import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> movables;

    public Herd() {
        movables = new ArrayList<>();        
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Movable movable : movables) {
            sb.append(movable.toString()).append("\n");
        }
        return sb.toString();
    }

    public void addToHerd(Movable movable) {
        movables.add(movable);
    }


    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx, dy);
        }
    }
}
