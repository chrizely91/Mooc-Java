public class Books {
    private String title;
    private int pages;
    private int year;

    public Books(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public void toStringName() {
        System.out.println(this.title);
    }

    public void toStringAll() {
        System.out.println(this.title + ", " + this.pages + " pages, " + this.year);
    }
}
