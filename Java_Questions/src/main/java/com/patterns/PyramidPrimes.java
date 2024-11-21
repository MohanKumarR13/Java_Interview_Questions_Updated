package com.patterns;

public class PyramidPrimes {

    public static void main(String[] args) {
        int maxNumber = 100;  // Maximum number to check for primes
        boolean[] isPrime = new boolean[maxNumber + 1];
        
        // Mark all numbers as prime
        for (int i = 2; i <= maxNumber; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes to find all primes up to maxNumber
        for (int i = 2; i * i <= maxNumber; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxNumber; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Print primes in pyramid shape
        int row = 1, count = 0;
        for (int i = 2; i <= maxNumber; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                count++;
                if (count == row) {
                    System.out.println(); // New line after each row
                    row++;  // Increase the number of primes for the next row
                    count = 0;  // Reset the count for the next row
                }
            }
        }
    }
}
