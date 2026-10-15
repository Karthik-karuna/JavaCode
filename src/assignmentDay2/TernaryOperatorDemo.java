package assignmentDay2;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        int number = 7;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + number + " is " + result + ".");
    }
}
