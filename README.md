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
---

## ▶️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/todoapp-java-console.git
   cd todoapp-java-console/src

2.Compile the code:
javac com/todo/*.java

3.Run the program:
java com.todo.ToDoApp

Sample Output
--- TO-DO MENU ---
1. Add Normal Task
2. Add Priority Task
3. List Tasks
4. Mark Task Completed
5. Delete Task
6. Exit
Choose an option: 1
Enter task title: Complete Assignment
Normal task added.

--- TO-DO MENU ---
3
--- Task List ---
1. [Pending] Complete Assignment

