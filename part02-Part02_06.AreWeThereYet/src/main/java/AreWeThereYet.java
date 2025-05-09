
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;

        do {
            System.out.println("Give a number:");
            value = scanner.nextInt();
        } while (value != 4);
    }
}
