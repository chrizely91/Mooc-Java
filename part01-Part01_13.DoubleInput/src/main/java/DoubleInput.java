
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Give a number:");
            double number = Double.valueOf(scanner.nextLine());

            System.out.println("You gave the number " + number);
        }
    }
}
