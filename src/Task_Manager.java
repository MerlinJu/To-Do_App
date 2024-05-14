package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_Manager {
    private static List<Task> taskList = new ArrayList<>();
    private static int taskIdCounter = 1;
    private static final Scanner scanner = new Scanner(System.in);

//    run the main loop
    public static void main(String[] args) {
        add_task();

//      print the taskList contents
        display_tasks();

        update_task();

        display_tasks();

//        close scanner
        scanner.close();
    }


//    add new tasks to the task list
    public static void add_task() {

//        Description
        System.out.println("EnterTask Description: ");
        String description = scanner.nextLine();

//        Difficulty
        System.out.println("Enter Task Difficulty: ");
        String difficulty = scanner.nextLine();


//        create new task with the provided description and pass ID the increment ID for next task
        Task newTask = new Task(taskIdCounter++, description, difficulty);

//        add the new task to the tasklist
        taskList.add(newTask);

        System.out.println("Task added succesfully");
    }


//    remove a task from the task list
    public static void remove_task() {
        System.out.println("Please provide the Task ID of the task you completed: ");
        int id_toDelete = scanner.nextInt();

//      remove the task with provided id from the list, correct index is -1 because iteration starts at 0
        taskList.remove(id_toDelete-1);

        System.out.println("Task removed succesfully");

    }


    public static void update_task() {
        System.out.println("Task ID of Task to be edited: ");
        int id_toEdit = scanner.nextInt();
        scanner.nextLine();

//        task to be edited
        Task task_toEdit = taskList.get(id_toEdit-1);

//        edit the task description
        System.out.println("Current Task Description : " + task_toEdit.getDescription());
        System.out.println("Enter the new task description: ");
        String new_taskDescription = scanner.nextLine();

//        update the description
        task_toEdit.setDescription(new_taskDescription);

        System.out.println("Task Description updatet succesfully.");
    }


//    display all tasks
    public static void display_tasks() {
        for (Task task : taskList) {
            System.out.println("Task ID: " + task.getId() + ", Description: " + task.getDescription() + ", Difficulty: " + task.getDifficulty());
        }
    }

}
