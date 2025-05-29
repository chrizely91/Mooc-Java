
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println();
            int value = scanner.nextInt();

            int total = value * value;

            System.out.println(total);
        }



    }
}
