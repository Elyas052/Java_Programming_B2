package day32_custom_classes;

public class Employee {

    // Instance variable.
    String name;
    int id;
    String jobTitle;
    double salary;

    // Create a Constructor with two parameters --> name & jobTitle.
    // Default constructor -> Explicitly.
    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    // Create a Constructor with four parameters --> name, jobTitle, id & salary;

    public Employee(String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Crate a method that sat name is going into meeting.
    public void goToMeeting() {
        System.out.println(name + " is going int meeting.");
    }

    public String toString() {
        String result = "Info about the employee: " + name +
                "\n\tId:\t\t\t" + id +
                "\n\tJob Title:\t" + jobTitle +
                "\n\tSalary:\t\t$ " + salary;

        return result;
    }
}
