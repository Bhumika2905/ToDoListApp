package com.todo;

public abstract class Task {
    protected String title;
    protected boolean isCompleted;

    public Task(String title) {
        this.title = title;
        this.isCompleted = false;
    }

    public void markCompleted() {
        this.isCompleted = true;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public String getTitle() {
        return title;
    }

    public abstract void displayTask(); // Polymorphic method
}

