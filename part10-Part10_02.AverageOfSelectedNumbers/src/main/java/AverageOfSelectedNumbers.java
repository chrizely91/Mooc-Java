
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> values = new ArrayList();
        
        
        while (true) {
            String row = scanner.nextLine();

            if (row.equals("end")) {
                break;
            }

            values.add(row);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String nOrP = scanner.nextLine();
        
        double average;

        if (nOrP.equals("n")) {
            average = values.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(s -> s < 0)
            .average()
            .getAsDouble();
        } else {
            average = values.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(s -> s > 0)
            .average()
            .getAsDouble();
        }

        System.out.println(average);


    }
}
