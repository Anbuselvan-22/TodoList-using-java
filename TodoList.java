import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- TO-DO LIST ---");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice){
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break;
                case 2:
                    System.out.print("Enter task number to remove: ");
                    int index = sc.nextInt();
                    if(index > 0 && index <= tasks.size()){
                        tasks.remove(index-1);
                        System.out.println("Task removed!");
                    } else {
                        System.out.println("Invalid task number!");
                    }
                    break;
                case 3:
                    System.out.println("\nYour Tasks:");
                    for(int i=0; i<tasks.size(); i++){
                        System.out.println((i+1) + ". " + tasks.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 4);

        sc.close();
    }
}
