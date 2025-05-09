
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int older = 0;
        String name = "";

        while (true) {
            String string = scanner.nextLine();

            if (string.isEmpty()) {
                break;
            }
            
            String[] pieces = string.split(",");

            int current = Integer.parseInt(pieces[1]);

            if (current > older) {
                older = current;
                name = pieces[0];
            }

        }
        System.out.println("Name of the oldest: " + name);

    }
}
