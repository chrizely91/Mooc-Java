
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> num = new ArrayList();

        while (true) {
            int row = scanner.nextInt();
            
            if (row < 0) {
                break;
            }

            num.add(row);
        }

        num.stream()
            .filter(s -> s >= 1 && s <= 5)
            .forEach(s -> System.out.println(s));
    }
}
