public class Employee {
    // Private fields for the Employee class
    private String name;
    private String email;

    // Constructor to initialize Employee object
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter method for the name
    public String getName() {
        return name;
    }

    // Setter method for the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the email
    public String getEmail() {
        return email;
    }

    // Setter method for the email
    public void setEmail(String email) {
        this.email = email;
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("Alice Smith", "alice.smith@example.com");

        // Printing initial values using getter methods
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Email: " + emp.getEmail());

        // Modifying the Employee object's attributes using setter methods
        emp.setName("Bob Johnson");
        emp.setEmail("bob.johnson@example.com");

        // Printing modified values using getter methods
        System.out.println("Updated Employee Name: " + emp.getName());
        System.out.println("Updated Employee Email: " + emp.getEmail());
    }
}
