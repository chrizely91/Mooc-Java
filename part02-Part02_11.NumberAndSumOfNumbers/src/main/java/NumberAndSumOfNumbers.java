
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int value;
        int count = 0;

        do {
            System.out.println("Give a number:");
            value = scanner.nextInt();
            total += value;

            if (value != 0) {
                count++;
            }

        } while (value != 0);

        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + total);
    }
}
