
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        Random random = new Random();
        this.numbers = new ArrayList<>();

        while (numbers.size() < 7) {
            int newNumber = random.nextInt(40) + 1; 
            if (containsNumber(newNumber) == false) {
                numbers.add(newNumber);
            }
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}

