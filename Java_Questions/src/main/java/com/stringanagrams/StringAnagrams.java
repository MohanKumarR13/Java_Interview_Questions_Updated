package com.stringanagrams;

public class StringAnagrams {

    public static boolean isAnagram(String str1, String str2) {
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Initialize character count array
        int countChar[] = new int[26];

        // Count characters in str1 and str2
        for (int i = 0; i < str1.length(); i++) {
            countChar[str1.charAt(i) - 'a']++;
            countChar[str2.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int num : countChar) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        // Check if the strings are anagrams and print the result
        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
