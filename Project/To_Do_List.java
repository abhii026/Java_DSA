import java.util.ArrayList;
import java.util.Scanner;

class To_Do_List {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choice = 0; // ✅ initialize choice

        do {
            System.out.println("\n=== To-Do List Menu ===");
            System.out.println("1. View Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            // check valid integer input
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number (1-4).");
                scanner.nextLine(); // clear invalid input
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine(); // Clear newline after number input

            switch (choice) {
                case 1:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet.");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine().trim();
                    if (!task.isEmpty()) {
                        tasks.add(task);
                        System.out.println("Task added.");
                    } else {
                        System.out.println("Task cannot be empty.");
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to delete.");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.print("Enter task number to delete: ");

                        if (scanner.hasNextInt()) {
                            int index = scanner.nextInt();
                            scanner.nextLine(); // Clear newline
                            if (index > 0 && index <= tasks.size()) {
                                String removed = tasks.remove(index - 1);
                                System.out.println("Deleted: " + removed);
                            } else {
                                System.out.println("Invalid task number.");
                            }
                        } else {
                            System.out.println("Please enter a valid number.");
                            scanner.nextLine(); // clear invalid input
                        }
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1-4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
