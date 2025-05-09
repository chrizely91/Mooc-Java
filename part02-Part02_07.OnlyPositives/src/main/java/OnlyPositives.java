
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int value = scanner.nextInt();
        
            if (value < 0) {
                System.out.println("Unsuitable number");
                continue; 
            }
        
            if (value == 0) {
                break; 
            }
        
            System.out.println(value * value);
        }
    }
}
