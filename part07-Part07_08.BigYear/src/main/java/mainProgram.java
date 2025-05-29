
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        Database database = new Database();

        while (true) { 
            System.out.println("?");
            String command = scan.nextLine();

            if (command.equals("Quit")) break;

            switch (command) {
                case "Add":
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Name in Latin: ");
                    String latin = scan.nextLine();
                    database.add(name, latin);
                    break;
                case "Observation":
                    System.out.print("Bird? ");
                    String type = scan.nextLine();
                    if (!database.addObservation(type)) {
                        System.out.println("Not a bird!");
                    }
                    break;
                case "All":
                    database.detailsBirds();                    
                    break;
                case "One":
                    System.out.print("Bird?");
                    String type_one = scan.nextLine();
                    System.out.println(database.detailsBird(type_one));
                    break;
            }
        }
        

    }

}
