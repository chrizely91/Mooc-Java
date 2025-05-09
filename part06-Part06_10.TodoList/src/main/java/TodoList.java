import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks = new ArrayList<>(); 

    public TodoList() {
        this.tasks = new ArrayList<>();
    }


    public void add(String task) {
        tasks.add(task);
    }


    public void print() {
        for(int i = 1; i <= tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i - 1));
        }        
    }

    public void remove(int number) {
        tasks.remove(number - 1);
    }
}
