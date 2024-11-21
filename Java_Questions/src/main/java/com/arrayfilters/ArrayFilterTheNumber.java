package com.arrayfilters;
public class ArrayFilterTheNumber {
    public static void main(String[] args) {
        // Initialize the array with the given values
        int[] numbers = {1, 21, 12, 123, 1234};

        // Print numbers that start with '1'
        System.out.println("Numbers that start with 1:");
        for (int num : numbers) {
            if (String.valueOf(num).startsWith("1")) {
                System.out.println(num);
            }
        }
    }
}