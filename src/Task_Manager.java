package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_Manager {
    private static List<Task> taskList = new ArrayList<>();

//    run the main loop
    public static void main(String[] args) {
        add_task();

//      print the taskList contents
        for (Task task : taskList) {
            System.out.println(task.getDescription());
        }
    }


//    add new tasks to the task list
    public static void add_task() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("EnterTask Description: ");
        String description = scanner.nextLine();

//        create new task with the provided description
        Task newTask = new Task(description);

//        add the new task to the tasklist
        taskList.add(newTask);

        System.out.println("Task added succesfully");
    }


//    remove task when status_done is true -> task is completed
    public static void remove_task() {

    }

//    display all tasks
    public static void display_tasks() {

    }

}
