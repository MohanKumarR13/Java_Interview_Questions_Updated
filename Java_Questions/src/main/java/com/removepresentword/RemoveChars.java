package com.removepresentword;

public class RemoveChars {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "ol";
        
        // Call the method to remove characters from str1
        String result = removeChars(str1, str2);
        
        // Output the result
        System.out.println("Result: " + result);
    }
    
    public static String removeChars(String str1, String str2) {
        String result = "";
        
        // Loop through each character in str1
        for (int i = 0; i < str1.length(); i++) {
            // Check if the character in str1 is not in str2
            if (str2.indexOf(str1.charAt(i)) == -1) {
                result += str1.charAt(i); // Append to result if not found in str2
            }
        }
        
        return result;
    }
}
