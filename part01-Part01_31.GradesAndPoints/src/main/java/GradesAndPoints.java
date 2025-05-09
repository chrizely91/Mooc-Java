
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Give points [0-100]:");
            int value = Integer.valueOf(scan.nextLine());

            if (value < 0) {
                System.out.println("Grade: impossible!");
            } else if (value <= 49) {
                System.out.println("Grade: failed!");
            } else if (value <= 59) {
                System.out.println("Grade: 1!");
            } else if (value <= 69) {
                System.out.println("Grade: 2!");
            } else if (value <= 79) {   
                System.out.println("Grade: 3!");
            } else if (value <= 89) {
                System.out.println("Grade: 4!");
            } else if (value <= 100) {
                System.out.println("Grade: 5!");
            } else {
                System.out.println("Grade: incredible!");
            }
        }
    }
}
