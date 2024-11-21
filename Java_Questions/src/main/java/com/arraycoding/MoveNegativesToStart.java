package com.arraycoding;

public class MoveNegativesToStart {

    public static void main(String[] args) {
        int[] arr = {12, -7, 5, -3, 8, -1, 0, 9, -6};

        // Print original array
        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Move negatives to the start of the array
        int index = 0;  // This will track the position for the next negative number

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Swap the current negative element with the element at 'index'
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

        // Print the modified array
        System.out.print("Array after moving negatives to the start: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

