package assignmentDay7;

class LimitCheck {
    // i) Final instance variable initialized to 50
    final int MAX_LIMIT = 50;

    public void checkLimit() {
        // ii) Attempting to change MAX_LIMIT will cause a Compilation Error:
        // MAX_LIMIT = 100; // Error: cannot assign a value to final variable MAX_LIMIT

        // iii) Print the value of MAX_LIMIT
        System.out.println("MAX_LIMIT value: " + MAX_LIMIT);
    }
}

public class FinalVariableAssignment {
    public static void main(String[] args) {
        LimitCheck obj = new LimitCheck();
        obj.checkLimit();
    }
}
