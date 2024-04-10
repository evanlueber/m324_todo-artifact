import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public void updateTask(String oldTask, String newTask) {
        int index = tasks.indexOf(oldTask);
        if (index != -1) {
            tasks.set(index, newTask);
        } else {
            System.out.println("Task not found!");
        }
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list!");
        } else {
            System.out.println("Tasks:");
            for (String task : tasks) {
                System.out.println("- " + task);
            }
        }
    }

    public static void main(String[] args) {
        ToDoList todoList = new ToDoList();

        todoList.addTask("Buy groceries");
        todoList.addTask("Finish homework");
        todoList.addTask("Call mom");

        System.out.println("Initial tasks:");
        todoList.listTasks();

        todoList.removeTask("Finish homework");
        System.out.println("\nTasks after removing 'Finish homework':");
        todoList.listTasks();

        todoList.updateTask("Call mom", "Call dad");
        System.out.println("\nTasks after updating 'Call mom' to 'Call dad':");
        todoList.listTasks();
    }
}