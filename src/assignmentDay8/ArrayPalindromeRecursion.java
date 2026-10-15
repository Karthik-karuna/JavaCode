package assignmentDay8;

public class ArrayPalindromeRecursion {
    // Recursive function to check palindrome
    public static boolean isPalindrome(int[] arr, int start, int end) {
        if (start >= end) {
            return true; // Base case: all pairs matched
        }
        
        if (arr[start] != arr[end]) {
            return false; // Mismatch found
        }
        
        return isPalindrome(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        
        if (isPalindrome(arr, 0, arr.length - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
