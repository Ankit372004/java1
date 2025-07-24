import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                }
                case 2 -> {
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks.");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                }
                case 3 -> {
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.print("Enter task number to remove: ");
                        int index = scanner.nextInt();
                        if (index >= 1 && index <= tasks.size()) {
                            tasks.remove(index - 1);
                            System.out.println("Task removed.");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
