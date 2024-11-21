package com.macafee;

import java.util.*;

public class LargestNumberInList {
    public static void main(String[] args) {
        // Initialize the list with some sample data
        List<Integer> numbers = Arrays.asList(23, 45, 12, 78, 56, 89, 34);

        // Find the largest number in the list
        int largest = Collections.max(numbers);

        // Print the largest number
        System.out.println("The largest number in the list is: " + largest);
    }
}
