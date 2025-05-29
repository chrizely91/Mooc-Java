public class Bird {
    private final String name;
    private final String latin;
    private int observations;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
    }

    public void addObservation() {
        this.observations++;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latin + "): " + this.observations + " observations";
    }
}
