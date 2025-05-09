
import java.nio.file.Paths;
import java.util.Scanner;

public class RecipeSearch {
    public static void main(String[] args) {
        ListRecipes listRecipes = new ListRecipes();

        System.out.print("File to read: ");
        Scanner scan = new Scanner(System.in);
        String patch = scan.nextLine();
        System.out.println();

        try (Scanner scanner = new Scanner(Paths.get(patch))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                if (name.isEmpty()) continue;
                
                int cookingTime = Integer.parseInt(scanner.nextLine());

                Recipe recipe = new Recipe();
                recipe.addName(name);
                recipe.addCookingTime(cookingTime);

                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    if (ingredient.isEmpty()) break;
                    recipe.addIngredient(ingredient);
                }
                
                listRecipes.add(recipe);
            } 
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        while (true) {
            System.out.print("Enter command: ");
            String command = scan.nextLine();

            if (command.equals("stop")) break;

            switch (command) {
                case "list":
                    listRecipes.printList();
                    break;
                case "find name":
                    System.out.print("Searched word: ");
                    String name = scan.nextLine();
                    listRecipes.printFindName(name);
                    break;
                case "find cooking time":
                    System.out.print("Max cooking time: ");
                    int time = Integer.parseInt(scan.nextLine());
                    listRecipes.printCookingTime(time);
                    break;
                case "find ingredient":
                    System.out.print("Ingredient: ");
                    String ingredient = scan.nextLine();
                    listRecipes.printFindIngredient(ingredient);
                    break;
                default:
                    System.out.println("Unknown command\n");
                }
            }
        }
    }

