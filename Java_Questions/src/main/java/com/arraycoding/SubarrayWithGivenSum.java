package com.arraycoding;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        // Input array and expected sum
        int[] numbers = {1, 4, 20, 3, 10, 5};
        int expectedSum = 33;

        int currentSum = 0;
        int start = 0;

        // Loop through the array with the 'end' pointer
        for (int end = 0; end < numbers.length; end++) {
            // Add the current element to the running sum
            currentSum += numbers[end];

            // Shrink the window from the left if the current sum exceeds the expected sum
            while (currentSum > expectedSum && start <= end) {
                currentSum -= numbers[start];
                start++;
            }

            // Check if the current sum matches the expected sum
            if (currentSum == expectedSum) {
                System.out.println("Subarray found with given sum " + expectedSum + ":");
                for (int i = start; i <= end; i++) {
                    System.out.print(numbers[i] + " ");
                }
                System.out.println();  // Print a newline for clarity
                return;
            }
        }

        // If no subarray is found
        System.out.println("No subarray found with the given sum.");
    }
}
