public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a model
        Student student = new Student("Prateek", 123, "A");

        // Create a view
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(student, view);

        // Update and display student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Pragya");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}
