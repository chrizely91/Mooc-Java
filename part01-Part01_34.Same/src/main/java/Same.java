
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Enter the first string:");
            String first = scan.nextLine();

            System.out.println("Enter the second string:");
            String second = scan.nextLine(); 

            if (first.equals(second)) {
                System.out.println("Same");
            } else {
                System.out.println("Different");
            }
        }
    }
}
