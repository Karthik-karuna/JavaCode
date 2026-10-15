package assignmentDay6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ==========================================
// 2. Final Method Demonstration
// ==========================================
class Parent {
    public final void displayRole() {
        System.out.println("Role: Parent");
    }
}

class Child extends Parent {
    // Attempting to override displayRole() will cause a compilation error:
    // @Override
    // public void displayRole() { System.out.println("Child"); }
}

// ==========================================
// 3. Final Class Demonstration
// ==========================================
final class Bank {
    public void showDetails() {
        System.out.println("Bank Details");
    }
}

// Attempting to inherit Bank will cause a compilation error:
// class HDFC extends Bank {}

// ==========================================
// 6. Static Variable Demonstration
// ==========================================
class Student {
    int id;
    String name;
    static String collegeName = "SLA Institute"; // Shared across all instances

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", College: " + collegeName);
    }
}

// ==========================================
// 8. Functional Interface Demonstration
// ==========================================
@FunctionalInterface
interface SquareCalculator {
    int square(int n);
}

class SquareImpl implements SquareCalculator {
    @Override
    public int square(int n) {
        return n * n;
    }
}

// ==========================================
// 9. Lambda Expression Interface
// ==========================================
@FunctionalInterface
interface Addition {
    int add(int a, int b);
}

// ==========================================
// Main Class
// ==========================================
public class AssignmentRunner {

    // 7. Static Method
    public static int calculateSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        System.out.println("=== 1. Final Variable ===");
        final int regNumber = 10245;
        System.out.println("Student Reg Number: " + regNumber);

        System.out.println("\n=== 2. Final Method ===");
        Child child = new Child();
        child.displayRole();

        System.out.println("\n=== 3. Final Class ===");
        Bank bank = new Bank();
        bank.showDetails();

        System.out.println("\n=== 4. Wrapper Class (Autoboxing/Unboxing) ===");
        int primitiveVal = 25;
        Integer objVal = primitiveVal; // Autoboxing
        int unboxedVal = objVal;       // Unboxing
        System.out.println("Autoboxed: " + objVal + " | Unboxed: " + unboxedVal);

        System.out.println("\n=== 5. Wrapper Class Conversion ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String inputStr = scanner.nextLine();
        int convertedNum = Integer.parseInt(inputStr);
        System.out.println("Parsed int + 10 = " + (convertedNum + 10));

        System.out.println("\n=== 6. Static Variable ===");
        Student s1 = new Student(101, "Karthik");
        Student s2 = new Student(102, "Anand");
        s1.display();
        s2.display();

        System.out.println("\n=== 7. Static Method ===");
        System.out.println("Square of 6 is: " + calculateSquare(6));

        System.out.println("\n=== 8. Functional Interface ===");
        SquareCalculator calc = new SquareImpl();
        System.out.println("Square of 5: " + calc.square(5));

        System.out.println("\n=== 9. Lambda Expression ===");
        Addition addition = (a, b) -> a + b;
        System.out.println("Addition (12 + 18): " + addition.add(12, 18));

        System.out.println("\n=== 10. Lambda Expression with forEach ===");
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.forEach(name -> System.out.println("Hello, " + name));

        scanner.close();
    }
}
