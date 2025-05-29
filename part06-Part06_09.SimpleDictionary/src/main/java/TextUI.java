import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;

    }


    public void start() {

        while (true) {
            System.out.println("Command: ");
            String texto = scanner.nextLine();
            
            if (texto.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } 
            else if (texto.equals("add  ")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();

                this.dict.add(word, translation);
            }
            else if (texto.equals("search")) {
                System.out.println("To be translated: ");
                String toTranslation = scanner.nextLine();
                
                String translated = this.dict.translate(toTranslation);
                
                if (translated == null) {
                    System.out.println("Word " + toTranslation + " was not found");

                } else {
                    System.out.println("Translation: " + translated);
                }
            }
            else {
                System.out.println("Unknown command");
            }
        }
        

    }

}
