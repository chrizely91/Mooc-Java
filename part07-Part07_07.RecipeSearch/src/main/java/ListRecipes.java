import java.util.ArrayList;
import java.util.List;

public class ListRecipes {
    private final List<Recipe> recipes;

    public ListRecipes() {
        this.recipes = new ArrayList<>();
    }


    public void add(Recipe recipe) {
        recipes.add(recipe);
    }

    public List<Recipe> getAllRecipes() {
        return new ArrayList<>(recipes);
    }

    public void printList() {
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public void printFindName(String name) {
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }

    public void printCookingTime(int time) {
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= time) {
                System.out.println(recipe);
            }
        }
    }

    public void printFindIngredient(String ingredient) {
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.hasIngredient(ingredient)) {
                System.out.println(recipe);
            }
        }
    }

}
