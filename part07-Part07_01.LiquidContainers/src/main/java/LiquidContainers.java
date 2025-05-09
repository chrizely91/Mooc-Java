
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int MAX = 100;
        int container_um = 0;
        int container_dois = 0;


        while (true) {
            System.out.println("First: " + container_um + "/100");
            System.out.println("Second: " + container_dois + "/100");

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
                    container_um = Math.min(container_um + liters, MAX);
                    break;
                    
                case "move":
                    int actualMove = Math.min(liters, container_um);
                    container_um -= actualMove;
                    container_dois = Math.min(container_dois + actualMove, MAX);
                    break;
                    
                case "remove":
                    container_dois = Math.max(container_dois - liters, 0);
                    break;
                default:
                    throw new AssertionError();
                
            }

        }
    }

}
