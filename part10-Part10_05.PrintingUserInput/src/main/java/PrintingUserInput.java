
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> frases = new ArrayList();

        while (true) {
            String row = scanner.nextLine();
            
            if (row.equals("")) {
                break;
            }

            frases.add(row);
        }

        frases.stream()
            .forEach(s -> System.out.println(s));
    }
}
