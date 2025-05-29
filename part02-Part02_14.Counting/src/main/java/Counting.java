
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int num = scanner.nextInt();

        while (num <= 100) {
            System.out.println(num);
            num++;
        }

    }
}
