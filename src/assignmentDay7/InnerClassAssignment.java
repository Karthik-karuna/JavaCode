package assignmentDay7;

class Outer {
    // i) Private integer variable
    private int data = 10;

    // ii) Non-static inner class
    class Inner {
        public void display() {
            // Inner class can directly access outer private members
            System.out.println("Value of data from Outer class: " + data);
        }
    }
}

public class InnerClassAssignment {
    public static void main(String[] args) {
        // iii) Create an instance of Outer first, then use it to create Inner instance
        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();

        // Calling display()
        innerObj.display();
    }
}
