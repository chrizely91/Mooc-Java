
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int value;

        do {
            System.out.println("Give a number:");
            value = scanner.nextInt();

            if (value != 0) {
                count++;
            }
        } while (value != 0);

        System.out.println("Number of numbers: " + count);
    }
}
