
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int older = 0;

        while (true) {
            String string = scanner.nextLine();

            if (string.isEmpty()) {
                break;
            }
            
            String[] pieces = string.split(",");

            int current = Integer.parseInt(pieces[1]);

            if (current > older) {
                older = current;
            }

        }
        System.out.println("Age of the oldest: " + older);


    }
}
