public class Control {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(10);

        // Adding employees
        manager.addEmployee(new Employee(1, "Prateek", "Developer", 80000));
        manager.addEmployee(new Employee(2, "Pragya", "Manager", 90000));
        manager.addEmployee(new Employee(3, "Ramesh", "Analyst", 76000));

        // Traversing employees
        System.out.println("All Employees:");
        manager.traverseEmployees();

        // Searching for an employee
        Employee emp = manager.searchEmployee(2);
        if (emp != null) {
            System.out.println("Found Employee: " + emp);
        } else {
            System.out.println("Employee not found.");
        }

        // Deleting an employee
        manager.deleteEmployee(2);

        // Traversing employees after deletion
        System.out.println("Employees after deletion:");
        manager.traverseEmployees();
    }
}
