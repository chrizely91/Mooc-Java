
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) { 
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            
            if(name.equals("")) {
                break;
            }

            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());

            books.add(new Book (name, age));
        }

        System.out.println("\n" + books.size() + " books in total.");

        Comparator<Book> comparator = Comparator
            .comparing(Book::getAgeRecommendation)
            .thenComparing(Book::getName);

        Collections.sort(books, comparator);

        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book);
        }    
    }

}
