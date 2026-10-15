package assignmentDay3;

class Student {
    String name;
    int age;
    String course;

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Course: " + course);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Karthik";
        student.age = 22;
        student.course = "Computer Science Engineering";

        student.displayDetails();
    }
}