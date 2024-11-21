package com.arraycoding;

public class LargestSecondLargestSmallest {

    // Function to find the largest, second largest, and smallest elements
    public static void findLargestSecondLargestSmallest(int[] arr) {
        // Initialize variables for the largest, second largest, and smallest elements
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // Edge case: If the array has fewer than 2 elements
        if (arr.length < 2) {
            System.out.println("Array needs at least two elements to find second largest.");
            return;
        }

        // Traverse through the array
        for (int i = 0; i < arr.length; i++) {
            // Update the smallest element
            if (arr[i] < smallest) {
                smallest = arr[i];
            }

            // Update the largest and second largest elements
            if (arr[i] > largest) {
                secondLargest = largest;  // Update second largest before largest
                largest = arr[i];         // Update largest
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];   // Update second largest if the element is not equal to largest
            }
        }

        // Display the results
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Smallest: " + smallest);
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        findLargestSecondLargestSmallest(arr);
    }
}
