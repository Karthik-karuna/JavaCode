package assignmentDay3;

class Employee {
    int id;
    String name;
    double salary;

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 101;
        emp1.name = "Rahul";
        emp1.salary = 45000.0;

        Employee emp2 = new Employee();
        emp2.id = 102;
        emp2.name = "Priya";
        emp2.salary = 52000.0;

        System.out.println("Employee 1 Details:");
        emp1.displayDetails();

        System.out.println("\nEmployee 2 Details:");
        emp2.displayDetails();
    }
}
