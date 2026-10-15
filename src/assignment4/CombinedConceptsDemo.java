package assignment4;

//Interface
interface EmployeeOperations {
 void performTask();
}

//Abstract class with encapsulated fields
abstract class Employee {
 private int id;
 private String name;
 private double baseSalary;

 public Employee(int id, String name, double baseSalary) {
     this.id = id;
     this.name = name;
     this.baseSalary = baseSalary;
 }

 // Encapsulated Getters & Setters
 public int getId() { return id; }
 public String getName() { return name; }
 public double getBaseSalary() { return baseSalary; }

 // Abstract method
 public abstract double calculateSalary();
}

//Concrete class extending Abstract class & implementing Interface
class ITEmployee extends Employee implements EmployeeOperations {
 private double bonus;

 public ITEmployee(int id, String name, double baseSalary, double bonus) {
     super(id, name, baseSalary);
     this.bonus = bonus;
 }

 @Override
 public double calculateSalary() {
     return getBaseSalary() + bonus;
 }

 @Override
 public void performTask() {
     System.out.println(getName() + " is writing backend Spring Boot code.");
 }
}

public class CombinedConceptsDemo {
 public static void main(String[] args) {
     // Polymorphism via Employee reference
     Employee emp = new ITEmployee(101, "Karthik", 60000.0, 15000.0);

     System.out.println("ID: " + emp.getId());
     System.out.println("Name: " + emp.getName());
     System.out.println("Total Salary: " + emp.calculateSalary());

     // Interface behavior
     EmployeeOperations ops = (EmployeeOperations) emp;
     ops.performTask();
 }
}
