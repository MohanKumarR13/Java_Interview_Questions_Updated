package com.nocharoccurance;

import java.util.HashMap;

public class NonRepeatChar {
    public static void main(String[] args) {
        // Input string
        String s = "leetcode"; // Example string

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count the frequency of each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character that occurs only once and return its index
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freqMap.get(c) == 1) {
                index = i;
                break; // First non-repeating character found, exit the loop
            }
        }

        // Output the index of the first non-repeating character
        System.out.println(index);  // If no non-repeating character is found, it will print -1
    }
}

