
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int sum = 0;

        int realFrom = Math.max(fromWhere, 0);
        int realTo = Math.min(toWhere, array.length);
        
        for (int i = realFrom; i < realTo; i++) {
            int value = array[i];
            if (value >= smallest && value <= largest) {
                sum += value;
            }
        }

        return sum;
    }

}
