package com.macafee;

import java.util.*;

public class PrimeNumbersInList {
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible, it's not a prime
            }
        }
        return true; // The number is prime
    }

    public static void main(String[] args) {
        // List of numbers to check
        List<Integer> numbers = Arrays.asList(10, 11, 15, 23, 24, 29, 37, 42);

        // List to store prime numbers
        List<Integer> primeNumbers = new ArrayList<>();

        // Check each number in the list
        for (int num : numbers) {
            if (isPrime(num)) {
                primeNumbers.add(num); // Add to the list of prime numbers
            }
        }

        // Print the prime numbers found in the list
        System.out.println("Prime numbers in the list: " + primeNumbers);
    }
}
