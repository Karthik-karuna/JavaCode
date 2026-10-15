package assignment4;

class Student {
    private String name;
    private int age;
    private double mark;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= 0 && mark <= 100) {
            this.mark = mark;
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student student = new Student();

        // Updating details using setters
        student.setName("Karthik");
        student.setAge(22);
        student.setMark(92.5);

        // Accessing details using getters
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Mark: " + student.getMark());
    }
}
