
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int first = scanner.nextInt();

        System.out.println();
        int second = scanner.nextInt();

        if (first > second) {
            System.out.printf("%d is greater than %d", first, second);
            return;
        } else if (first < second) {
            System.out.printf("%d is smaller than %d", first, second);
            return;
        }
        System.out.printf("%d is equal to %d", first, second);

    }
}
