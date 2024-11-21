package com.arraycoding;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = 3;  // Number of rotations
        
        // Normalize n to avoid unnecessary rotations
        n = n % arr.length;
        
        // Rotate right by reversing parts of the array
        int len = arr.length;
        int[] result = new int[len];
        
        // Place the last n elements at the front
        System.arraycopy(arr, len - n, result, 0, n);
        
        // Place the remaining elements after the last n elements
        System.arraycopy(arr, 0, result, n, len - n);
        
        // Copy the result back to the original array
        System.arraycopy(result, 0, arr, 0, len);
        
        // Print the rotated array
        System.out.println(Arrays.toString(arr));
    }
}
