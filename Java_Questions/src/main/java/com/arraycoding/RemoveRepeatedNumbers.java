package com.arraycoding;

import java.util.HashMap;

public class RemoveRepeatedNumbers {
    public static void main(String[] args) {
        // Input array
        int[] numbers = {1, 4, 20, 3, 10, 5, 3, 4, 20};

        // Step 1: Count the frequency of each element using a HashMap
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Print numbers that appear exactly once
        System.out.println("Array with numbers that appear only once:");
        for (int num : numbers) {
            if (frequencyMap.get(num) == 1) {
                System.out.print(num + " ");
            }
        }
    }
}

