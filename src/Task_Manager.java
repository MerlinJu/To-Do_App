package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_Manager {
    private static List<Task> taskList = new ArrayList<>();
    private static int taskIdCounter = 1;

//    run the main loop
    public static void main(String[] args) {
        add_task();

//      print the taskList contents
        display_tasks();
    }


//    add new tasks to the task list
    public static void add_task() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("EnterTask Description: ");
        String description = scanner.nextLine();

//        create new task with the provided description and pass ID the increment ID for next task
        Task newTask = new Task(taskIdCounter++, description);

//        add the new task to the tasklist
        taskList.add(newTask);

        System.out.println("Task added succesfully");
    }


//    remove a task from the task list
    public static void remove_task() {

    }

//    display all tasks
    public static void display_tasks() {
        for (Task task : taskList) {
            System.out.println("Task ID: " + task.getId() + ", Description: " + task.getDescription());
        }
    }

}
