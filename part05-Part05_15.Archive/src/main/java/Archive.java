public class Archive {
    private String id;
    private String name;

    public Archive(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean isUnique(String newId) {
        return !this.id.equals(newId);
    }

    public String getId() {
        return this.id;
    }

    public String toString() {
        return this.id + ": " + this.name;
    }

}
