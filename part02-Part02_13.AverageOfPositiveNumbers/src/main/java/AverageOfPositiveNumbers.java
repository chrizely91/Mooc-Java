
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int value;
        int count = 0;

        do {
            System.out.println("Give a number:");
            value = scanner.nextInt();

            if (value > 0) {
                total += value;
                count++;
            }
        } while (value != 0);

        if (count < 1) {
            System.out.println("Cannot calculate the average");
        } 
        System.out.println(((total * 1.0) / count));       
    }
}
