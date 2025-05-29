
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Give a year: ");
            int value = Integer.valueOf(scan.nextLine());

            if (value < 2015) {
                System.out.println("Ancient history!");
            }
        }
    }
}
