
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Write a message:");
            
            // Write your program here
            String texto = scanner.nextLine();
            
            System.out.println(texto);
        }

    }
}