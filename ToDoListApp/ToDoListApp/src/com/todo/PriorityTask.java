package com.todo;

public class PriorityTask extends Task {
    private int priority;

    public PriorityTask(String title, int priority) {
        super(title);
        this.priority = priority;
    }

    @Override
    public void displayTask() {
        String priorityText = switch (priority) {
            case 1 -> "High";
            case 2 -> "Medium";
            case 3 -> "Low";
            default -> "Unknown";
        };
        System.out.println("[Priority: " + priorityText + "] " + (isCompleted ? "[Done] " : "[ ] ") + title);
    }
}

