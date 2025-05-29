
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean checkRepetido(Book comparison) {
        return this.name.equals(comparison.name) &&
                this.publicationYear == comparison.publicationYear;
    }

}
