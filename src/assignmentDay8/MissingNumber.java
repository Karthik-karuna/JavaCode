package assignmentDay8;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        
        // Array has 4 elements, so N should be 5
        int n = arr.length + 1;
        
        // Sum of numbers from 1 to N using formula: N * (N + 1) / 2
        int expectedSum = n * (n + 1) / 2;
        
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number: " + missingNumber);
    }
}
