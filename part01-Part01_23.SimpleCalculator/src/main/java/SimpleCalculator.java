
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Give the first number:");
            int first = Integer.valueOf(scanner.nextLine());

            System.out.println("Give the second number:");
            int second = Integer.valueOf(scanner.nextLine());

            int sum = first + second;
            int sub = first - second;
            int mul = first * second;
            double div = (first * 1.0) / second;

            System.out.println(first + " + " + second + " = " + sum);
            System.out.println(first + " - " + second + " = " + sub);
            System.out.println(first + " * " + second + " = " + mul);
            System.out.println(first + " / " + second + " = " + div);
        }
    }
}
