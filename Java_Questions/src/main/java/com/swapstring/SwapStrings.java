package com.swapstring;

public class SwapStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        // Swapping strings without using a third variable
        str1 = str1 + str2; // Concatenate str1 and str2
        
        // Extract str2 (the original value of str2) from the concatenated string
        str2 = str1.substring(0, str1.length() - str2.length());
        
        // Extract str1 (the original value of str1) from the concatenated string
        str1 = str1.substring(str2.length());
        
        System.out.println("After swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
