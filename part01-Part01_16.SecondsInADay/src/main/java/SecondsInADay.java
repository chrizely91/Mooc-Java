
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("How many days would you like to convert to seconds?");
            Integer days = Integer.valueOf(scanner.nextLine());

            Integer seconds = days * 86400;

            System.out.println(seconds);
        }
    }
}
