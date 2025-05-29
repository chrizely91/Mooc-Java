
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPrints = scanner.nextInt();

        Random ladyLuck = new Random();

        for (int i = 0; i < numberOfPrints; i++) {
            int randomNumber = ladyLuck.nextInt(11);
            System.out.println(randomNumber);
        }
    }

}
