package com.todo;

public class NormalTask extends Task {

    public NormalTask(String title) {
        super(title);
    }

    @Override
    public void displayTask() {
        System.out.println("[Normal] " + (isCompleted ? "[Done] " : "[ ] ") + title);
    }
}

