
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        String file = scanner.nextLine();

        readBooks(file);

    }


    public static List<Book> readBooks(String file) {
        List<Book> books;
        try {
            books = Files.lines(Paths.get(file))
            .map(row -> row.split(","))
            .filter(parts -> parts.length == 4)
            .map(parts -> new Book(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), parts[3]))
            .collect(Collectors.toList());

            return books;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
    }

}
