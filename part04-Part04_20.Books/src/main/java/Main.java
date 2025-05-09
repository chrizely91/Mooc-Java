import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine()); 

            System.out.println("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine()); 

            books.add(new Books(title, pages, year));

        }

        System.out.println("What information will be printed?");
            String printWhat = scanner.nextLine();

        for (Books book : books) {
            if (printWhat.equals("everything")) {
                book.toStringAll();
            } else if (printWhat.equals("name")) {
                book.toStringName();
            } else {
                System.out.println("Try again");
            }
        }
            
    }
}
