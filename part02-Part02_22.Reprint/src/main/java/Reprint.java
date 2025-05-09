
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int x = scanner.nextInt();

        while (x > 0) {
            printText();
            x--;
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
