package webapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OptionsMenu {

    private Scanner Scanner;
    private List<Task> catalogTasks;

    public OptionsMenu() {
        Scanner = new Scanner(System.in);
        catalogTasks = new ArrayList<>();
    }

    public void mostrarMenu() {

        String option = null;

        do {
            System.out.println("List of asigments in your area.");
            System.out.println("1. Add Task.");
            System.out.println("2. Search a Task.");
            System.out.println("3. Delete a Task.");
            System.out.println("4. Modify a Task.");
            System.out.println("5. Look up the list of Tasks.");
            System.out.println("6. EXIT");
            System.out.print("Type your Option: ");
            option = Scanner.nextLine();

            switch(option) {
                case "1":
                    addTask();
                    break;

            }
        } while (!option.equals("6"));
    }

    public void addTask() {
        System.out.print("Title: ");
        String title = Scanner.nextLine();
        System.out.print("Task Description: ");
        String Description = Scanner.nextLine();
        System.out.print("Location: ");
        String taskLocation = Scanner.nextLine();
        Task task = new Task(title.trim(), Description.trim(), taskLocation.trim());
        catalogTasks.add(task);
    }




}
