
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        String name = "";
        double year = 0;


        while (true) {
            String string = scanner.nextLine();

            if (string.isEmpty()) {
                break;
            }

            String[] pieces = string.split(",");

            year +=  Integer.parseInt(pieces[1]);

            String currentName = pieces[0];
            
            if (currentName.length() > name.length()) {
                name = currentName;
            }
            count++;

        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (year / count));

    }
}
