import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface (TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }


    public void start() {
        while (true) {
            System.out.println("Command: ");
            String texto = scanner.nextLine();
            switch (texto) {
                case "stop":
                    return;
                case "add":
                    System.out.println("To add: ");
                    String task = scanner.nextLine();
                    this.todoList.add(task);
                    break;
                case "list":
                    this.todoList.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed?");
                    int taskId = Integer.valueOf(scanner.nextLine());
                    this.todoList.remove(taskId);
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }

}
