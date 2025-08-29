# ToDoListApp
A simple Java console-based To-Do List application with support for normal tasks and priority-based tasks. Features include adding tasks, marking them complete, deleting tasks, and displaying all tasks in a structured way.
# 📝 Java To-Do List (Console App)

This is a **console-based To-Do List application** built in Java.  
It demonstrates Object-Oriented Programming (OOP) concepts with **inheritance and polymorphism** through `NormalTask` and `PriorityTask` classes.

---

## 🚀 Features
- Add **Normal Tasks** with a simple title.
- Add **Priority Tasks** (High, Medium, Low).
- List all tasks with clear formatting.
- Mark tasks as **completed**.
- Delete tasks from the list.
- Simple menu-driven interface for easy interaction.

---

## 🛠️ Tech Stack
- **Language:** Java (JDK 8+)
- **Concepts Used:** OOP (Encapsulation, Inheritance, Polymorphism), Collections API

---

## 📂 Project Structure
src/
└── com/todo/
├── ToDoApp.java # Main application with menu
├── Task.java # Abstract base class
├── NormalTask.java # Inherits Task, represents a simple task
└── PriorityTask.java # Inherits Task, adds priority feature
