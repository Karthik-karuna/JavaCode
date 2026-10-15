package assignmentDay8;

import java.util.Arrays;

public class ReverseArrayRecursion {
    // Recursive function to swap elements
    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return; // Base case
        }
        
        // Swap elements at start and end
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        // Recursive call for inner elements
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        reverse(arr, 0, arr.length - 1);
        
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
