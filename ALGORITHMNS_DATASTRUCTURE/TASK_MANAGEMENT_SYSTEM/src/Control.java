public class Control {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Adding tasks
        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Implement Backend", "In Progress"));
        manager.addTask(new Task(3, "Write Tests", "Completed"));

        // Traversing tasks
        System.out.println("All Tasks:");
        manager.traverseTasks();

        // Searching for a task
        Task task = manager.searchTask(2);
        if (task != null) {
            System.out.println("Found Task: " + task);
        } else {
            System.out.println("Task not found.");
        }

        // Deleting a task
        manager.deleteTask(2);

        // Traversing tasks after deletion
        System.out.println("Tasks after deletion:");
        manager.traverseTasks();
    }
}
