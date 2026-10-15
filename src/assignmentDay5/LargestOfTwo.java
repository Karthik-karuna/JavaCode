package assignmentDay5;

public class LargestOfTwo {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 78;

        if (num1 > num2) {
            System.out.println(num1 + " is the largest.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the largest.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
