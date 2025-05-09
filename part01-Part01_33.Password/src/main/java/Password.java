
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Password?");
            String senha = scan.nextLine();

            if (senha.equals("Caput Draconis")) {
                System.out.println("Welcome!");
            } else {
                System.out.println("Off with you!");
            }
        }
    }
}
