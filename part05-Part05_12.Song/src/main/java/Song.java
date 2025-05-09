
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object comparison) {
        Song otherSong = (Song) comparison;
        return this.artist.equals(otherSong.artist) &&
               this.name.equals(otherSong.name) &&
               this.durationInSeconds == otherSong.durationInSeconds;
    } 

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
