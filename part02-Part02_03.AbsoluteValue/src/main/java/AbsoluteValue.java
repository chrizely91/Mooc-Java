
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println();
            int value = scanner.nextInt();

            if (value < 0) {
                value = value * -1;
            }

            System.out.println(value);
        }

    }
}
