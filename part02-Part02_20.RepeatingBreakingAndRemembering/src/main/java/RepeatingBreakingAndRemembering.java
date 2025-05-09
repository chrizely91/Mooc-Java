
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers:");

        while (true) { 
            int num = scanner.nextInt(); 

            if (num == -1) {
                break;
            }

            sum += num;
            count++;

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (sum * 1.0) / count);
        System.out.println("Even: " + even);
        System.out.println("Odds: " + odd);
    }
}
