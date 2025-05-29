
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println();
            int first = scanner.nextInt();

            System.out.println();
            int second = scanner.nextInt();

            int total = first + second;
            
            double square = Math.sqrt(total);

            System.out.println(square);
        }      
    }
}
