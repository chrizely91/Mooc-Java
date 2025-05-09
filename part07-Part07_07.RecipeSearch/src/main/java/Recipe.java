
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private final String name;
    private final int cookingTime;
    private final List<String> ingredients;
    

    public Recipe(String name, int cookingTime, List<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>(ingredients);
    }

    

    public String getName() {
        return name;
    }
    
    public int getCookingTime() {
        return cookingTime;
    }
    
    public List<String> getIngredients() {
        return ingredients;
    }

    public boolean hasIngredient(String ing) {
        return ingredients.contains(ing);
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }   

}
