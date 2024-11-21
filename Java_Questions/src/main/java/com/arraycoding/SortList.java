package com.arraycoding;

import java.util.List;
import java.util.ArrayList;

public class SortList {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);

        // Bubble Sort: Sort the list in ascending order
        int n = numbers.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements and swap if needed
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }

        // Print the sorted list
        System.out.println("Sorted List: " + numbers);
    }
}
