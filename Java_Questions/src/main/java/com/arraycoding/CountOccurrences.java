package com.arraycoding;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrences {
    public static void main(String[] args) {
        // Input array
        int[] numbers = {3, 7, 2, 8, 7, 3, 1, 2};

        // HashMap to store the element and its count
        Map<Integer, Integer> occurrences = new HashMap<>();

        // Iterate through the array
        for (int number : numbers) {
            // If the element is already in the map, increment its count
            occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
        }

        // Print the occurrences of each element
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
