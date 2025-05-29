import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager joke, Scanner scanner) {
        this.jokes = joke;
        this.scanner = scanner;
    }

    public void start() {
        while (true) { 
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = this.scanner.nextLine();

            switch (command) {
                case "X":
                    return;
                case "1":
                    System.out.println("Write the joke to be added:");
                    String joke = scanner.nextLine();
                    jokes.addJoke(joke);
                    break;
                case "2":
                    System.out.println(jokes.drawJoke());
                    break;
                case "3":
                    jokes.printJokes();
                    break;

            }
        }
    }
}
