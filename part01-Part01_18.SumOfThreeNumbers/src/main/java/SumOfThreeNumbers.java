
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Give the first number:");
            int first = Integer.valueOf(scanner.nextLine());

            System.out.println("Give the second number:");
            int second = Integer.valueOf(scanner.nextLine());

            System.out.println("Give the third number:");
            int third = Integer.valueOf(scanner.nextLine());

            int total = first + second + third;

            System.out.println("The sum of the numbers is " + total);
        }

        // Write your program here

    }
}
