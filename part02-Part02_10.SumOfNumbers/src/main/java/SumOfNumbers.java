
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int value;

        do {
            System.out.println("Give a number:");
            value = scanner.nextInt();
            total += value;

        } while (value != 0);

        System.out.println("Sum of the numbers: " + total);
    }
}

