package assignmentDay7;

class Counter {
    // i) Static variable shared across all instances
    static int count = 0;

    // ii) Constructor increments count every time a new object is created
    public Counter() {
        count++;
    }

    // iii) Static method to print current count
    public static void displayCount() {
        System.out.println("Current count: " + count);
    }
}

public class StaticCounterAssignment {
    public static void main(String[] args) {
        // iv) Create 3 objects of Counter
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Call displayCount()
        Counter.displayCount(); // Output will be: Current count: 3
    }
}
