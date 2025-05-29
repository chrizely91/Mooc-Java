
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(); 
        int sum = 0;
        
        // implement here a program, that first reads user input
        while (true) { 
            int value = scanner.nextInt();
            if (value == -1) {
                break;
            }

            list.add(value);
            sum += value;
        }        

        double average = (sum * 1.0) / list.size();

        System.out.println("Average: " + average);
        
    }
}
