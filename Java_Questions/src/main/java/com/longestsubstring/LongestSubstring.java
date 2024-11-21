package com.longestsubstring;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        // Input string
        String s = "abcabcbb";
        
        // Initialize variables
        HashSet<Character> set = new HashSet<>();
        int start = 0; // Left pointer of the sliding window
        int maxLength = 0; // To track the maximum length of substring

        // Traverse the string with the 'end' pointer
        for (int end = 0; end < s.length(); end++) {
            // If the character is already in the set, remove characters from the start to shrink the window
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }
            
            // Add the current character to the set
            set.add(s.charAt(end));

            // Update the maximum length of the substring
            maxLength = Math.max(maxLength, end - start + 1);
        }

        // Print the result
        System.out.println("Length of longest substring without repeating characters: " + maxLength);
    }
}
