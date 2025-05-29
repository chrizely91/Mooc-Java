
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] partes = input.split(" ");
            String command = partes[0];
            int liters = Integer.valueOf(partes[1]);

            if (liters < 0) {
                break;
            }

            switch (command) {
                case "add":
                    first.add(liters);
                    break;
                    
                case "move":
                    int actualMove = Math.min(liters, first.contains());
                    first.remove(actualMove);
                    second.add(actualMove);
                    break;
                    
                case "remove":
                    second.remove(liters);
                    break;
                default:
                    throw new AssertionError();
                
            }

        }
    }

}
