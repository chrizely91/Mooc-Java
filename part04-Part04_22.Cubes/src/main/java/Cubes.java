
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        while (true) { 
            String string = scanner.nextLine();

            if (string.equals("end")) {
                break;
            }
            num = Integer.parseInt(string);

            System.out.println(num * num * num);
        }
        
    }
}
