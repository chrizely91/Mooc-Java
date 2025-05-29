
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Give a number: ");
            int value = Integer.valueOf(scan.nextLine());

            if (value <= 0) {
                System.out.println("The number is not positive.");
            } else {
                System.out.println("The number is positive.");
            }
        }
    }
}
