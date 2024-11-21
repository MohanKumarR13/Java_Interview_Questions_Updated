package com.stringtoint;
// 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 
public class StringToInt {
    public static void main(String[] args) {
        String str = "12345";  // Example input
        System.out.println(stringToInt(str));  // Convert and print result
    }

    public static int stringToInt(String str) {
        int result = 0, sign = 1;

        // Handle negative sign
        if (str.charAt(0) == '-') {
            sign = -1;
            str = str.substring(1);  // Remove the negative sign
        }

        // Convert each character to an integer
        for (char c : str.toCharArray()) {
            result = result * 10 + (c - '0');
        }

        return result * sign;  // Return with the correct sign
    }
}
