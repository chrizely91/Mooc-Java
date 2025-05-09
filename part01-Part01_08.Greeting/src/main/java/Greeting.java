
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("What's your name?");

            String nome = scanner.nextLine();

            System.out.println("Hi " + nome);
        }
    }
}
