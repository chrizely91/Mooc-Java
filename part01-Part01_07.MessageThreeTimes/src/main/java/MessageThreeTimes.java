
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Write a message:");
            // Write your program here
            String frase = scanner.nextLine();

            for (int i = 0; i < 3; i++) {
                System.out.println(frase);
            }
        };
    }
}
