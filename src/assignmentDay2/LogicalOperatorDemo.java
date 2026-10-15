package assignmentDay2;

public class LogicalOperatorDemo {
    public static void main(String[] args) {
        int age = 20;
        boolean isCitizen = true;

        if (age >= 18 && isCitizen) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }
}
