package com.printoutput;

public class TransformString {
    public static void main(String[] args) {
        String input = "a1b2c3";
        String output = transformString(input);
        System.out.println(output); // Should print "abbccc"
    }

    public static String transformString(String input) {
        String result = ""; // Initialize an empty string

        for (int i = 0; i < input.length(); i += 2) {
            char letter = input.charAt(i); // Get the letter
            int count = input.charAt(i + 1) - '0'; // Get the digit and convert to int

            // Append the letter 'count' times
            for (int j = 0; j < count; j++) {
                result += letter;
            }
        }

        return result; // Return the constructed result
    }
}
