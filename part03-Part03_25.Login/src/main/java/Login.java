
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        if (password.equals("sunshine") && username.equals("alex") ||  password.equals("haskell") && username.equals("emma")) {
            System.out.println("You have successfully logged in!");
            return;
        }
        System.out.println("Incorrect username or password!");
    }
}
