
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> values = new ArrayList();
        
        
        while (true) {
            String row = scanner.nextLine();

            if (row.equals("end")) {
                break;
            }

            values.add(row);
        }

        double average = values.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();

        System.out.println(average);

    }
}
