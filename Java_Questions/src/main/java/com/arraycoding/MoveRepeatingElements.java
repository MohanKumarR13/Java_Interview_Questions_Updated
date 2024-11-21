package com.arraycoding;

import java.util.HashSet;

import java.util.HashSet;

public class MoveRepeatingElements {

    public static void main(String[] args) {
        int[] arr = {4, 3, 4, 2, 4, 1, 2};

        // Print original array
        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int n = arr.length;
        HashSet<Integer> seen = new HashSet<>();
        int index = 0;  // Position to place unique elements

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // If the element is not repeated, place it in the front
            if (!seen.contains(arr[i])) {
                arr[index] = arr[i];
                seen.add(arr[i]);
                index++;
            }
        }

        // Fill the rest of the array with 0 or any placeholder for repeating elements
        while (index < n) {
            arr[index] = 0;  // Placeholder for repeating elements
            index++;
        }

        // Print the modified array
        System.out.print("Array after moving repeating elements to the end: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
