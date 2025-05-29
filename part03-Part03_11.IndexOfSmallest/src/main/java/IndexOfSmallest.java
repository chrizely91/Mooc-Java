
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) { 
            int input = scanner.nextInt();
            if (input == 9999) {
                break;
            }
            
            list.add(input);
        }

        int smallest = list.get(0);
        ArrayList<Integer> indexes = new ArrayList<>();
        
        // ACHAR INDEX
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);

            if (current < smallest) {
                indexes.add(i);
                smallest = current;

                indexes.clear();
                indexes.add(i);

            } else if (current == smallest) {
                indexes.add(i);
            }
        }

        // PRINT VALOR
        System.out.println("Smallest number: " + smallest);


        // PRINT INDEXEX
        for (int index : indexes) {
            System.out.println("Found at index: " + index);
        }
    }
}
