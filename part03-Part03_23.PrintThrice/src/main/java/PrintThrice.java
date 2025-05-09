
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = 3;
        // Write your program here

        System.out.println("Give a word: ");
        String word = scanner.nextLine();

        for (int i = 0; i < repeat; i++) {
            System.out.print(word);
        }

    }
}
