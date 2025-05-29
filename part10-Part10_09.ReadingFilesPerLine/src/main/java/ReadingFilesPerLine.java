
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here
        String file = scanner.nextLine();

        read(file);

    }

    public static List<String> read(String file) {
        List<String> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get(file)).forEach(s -> rows.add(s));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return rows;
    }

}
