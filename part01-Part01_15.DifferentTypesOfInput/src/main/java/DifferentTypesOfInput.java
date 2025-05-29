
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Give a string:");
            String strValue = scan.nextLine();

            System.out.println("Give an integer:");
            Integer intValue = Integer.valueOf(scan.nextLine());

            System.out.println("Give a double:");
            Double douValue = Double.valueOf(scan.nextLine());

            System.out.println("Give a boolean:");
            Boolean boolValue = Boolean.valueOf(scan.nextLine());

            System.out.println("You gave the string " + strValue);
            System.out.println("You gave the integer " + intValue);
            System.out.println("You gave the double " + douValue);
            System.out.println("You gave the boolean " + boolValue);
        }
    }
}
