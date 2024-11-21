package com.greatestofnumber;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatest = Integer.MIN_VALUE; // Initialize with the smallest possible integer

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            if (number > greatest) {
                greatest = number; // Update greatest if current number is larger
            }
        }

        System.out.println("The greatest number is: " + greatest);
        scanner.close();
    }
}
