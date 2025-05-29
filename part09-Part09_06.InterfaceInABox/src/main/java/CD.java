public class CD implements Packable {
    private String artist;
    private String name;
    private int year;
    private static final double WEIGHT = 0.1;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
    }

    @Override
    public double weight() {
        return CD.WEIGHT;
    }

    @Override
    public String toString() {
        return artist + ": " + name + " (" + year + ")";
    }

}
