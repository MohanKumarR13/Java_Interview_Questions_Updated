package com.avgofnum;

import java.util.Scanner;

public class AvgOfTwoNum {
    public static void main(String[] args) {
        // Using Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Calculate average
        double average = (num1 + num2) / 2;
        
        // Display the result
        System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);
        
        // Close the scanner
        scanner.close();
    }
}
