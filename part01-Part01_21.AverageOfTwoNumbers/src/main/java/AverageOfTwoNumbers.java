
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Give the first number:");
            int first = Integer.valueOf(scanner.nextLine());

            System.out.println("Give the second number:");
            int second = Integer.valueOf(scanner.nextLine());

            double average = ((first * 1.0) + second) / 2;

            System.out.println("The average is " + average);
        }
    }
}
