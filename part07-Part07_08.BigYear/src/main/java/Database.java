import java.util.ArrayList;

public class Database {
    private ArrayList<Bird> birds = new ArrayList<>();
    

    public void add(String name, String latin) {
        Bird bird = new Bird(name, latin);
        birds.add(bird);
    }

    public Boolean addObservation(String name) {
        Bird bird = findByName(name);
        if (bird != null) {
            bird.addObservation();
            return true;
        }
        return false;
    }

    public String detailsBird(String name) {
        Bird bird = findByName(name);
        
        return bird != null ? bird.toString() : "Not a bird!";
    }

    private Bird findByName(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }

    public void detailsBirds() {
        for (Bird bird : this.birds) {
            System.out.println(bird.toString());
        }
    }
}

