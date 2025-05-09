
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        boolean unico = true;
        for (String me : this.meals) {
            if (me.equals(meal)) {
                unico = false;
            }
        }

        if (unico == true) {
            meals.add(meal);
        }
    }

    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        meals.clear();
    }
}
