
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points numbers = new Points();
        int num;

        while (true) {
            num = scanner.nextInt();

            if (num == -1) {
                break;
            }

            numbers.add(num);


        }

        System.out.println("Point average (all): " + numbers.average());
        System.out.println("Point average (passing): " + numbers.averageWithPassingGradeDefault());
        System.out.println("Pass percentage: " + numbers.percentage());
        numbers.printDistribution();
    }
}
