package com.todo;

import java.util.*;

public class ToDoApp {
    private static final List<Task> tasks = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- TO-DO MENU ---");
            System.out.println("1. Add Normal Task");
            System.out.println("2. Add Priority Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Mark Task Completed");
            System.out.println("5. Delete Task");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addNormalTask();
                case 2 -> addPriorityTask();
                case 3 -> listTasks();
                case 4 -> markTaskCompleted();
                case 5 -> deleteTask();
                case 6 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option! Try again.");
            }
        }
    }

    private static void addNormalTask() {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        tasks.add(new NormalTask(title));
        System.out.println("Normal task added.");
    }

    private static void addPriorityTask() {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        System.out.print("Enter priority (1=High, 2=Medium, 3=Low): ");
        int priority = Integer.parseInt(scanner.nextLine());
        tasks.add(new PriorityTask(title, priority));
        System.out.println("Priority task added.");
    }

    private static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("\n--- Task List ---");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.print((i + 1) + ". ");
                tasks.get(i).displayTask();
            }
        }
    }

    private static void markTaskCompleted() {
        listTasks();
        System.out.print("Enter task number to mark as completed: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markCompleted();
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void deleteTask() {
        listTasks();
        System.out.print("Enter task number to delete: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted.");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}

