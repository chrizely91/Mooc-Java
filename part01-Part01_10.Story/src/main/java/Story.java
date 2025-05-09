
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("I will tell you a story, but I need some information first.");
            System.out.println("What is the main character called?");
            String nome = scanner.nextLine();

            System.out.println("What is their job?");
            String profissão = scanner.nextLine();

            System.out.println("Here is the story:");
            System.out.println("Once upon a time there was " + nome + ", who was " + profissão + ".");
            System.out.println("On the way to work, " + nome + " reflected on life.");
            System.out.println("Perhaps " + nome + " will not be " + profissão + " forever.");
        }
    }
}
