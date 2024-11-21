package com.reverse_word_in_string;

public class ReverseWords  {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        String str = "Welcome To Java"; // Original String
        String[] words = str.split(" "); // Splitting String into words
        String reverseString = "";

        // Reverse each word and add it to reverseString
        for (String w : words) {
            String reverseWord = "";

            // Reverse the current word
            for (int i = w.length() - 1; i >= 0; i--) {
                reverseWord = reverseWord + w.charAt(i);
            }

            reverseString = reverseString + reverseWord + "*";  // Append reversed word and asterisk
        }

        // Remove the last '*' from reverseString
        if (reverseString.endsWith("*")) {
            reverseString = reverseString.substring(0, reverseString.length() - 1);
        }

        System.out.println(reverseString);
    }
}