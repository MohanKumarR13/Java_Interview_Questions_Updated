package com.arraycoding;

public class ArraySortChecker {

    // Function to check if the array is sorted in ascending order
    public static boolean isSortedAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;  // If any element is greater than the next, it's not sorted in ascending order
            }
        }
        return true;  // If no such case was found, the array is sorted in ascending order
    }

    // Function to check if the array is sorted in descending order
    public static boolean isSortedDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;  // If any element is smaller than the next, it's not sorted in descending order
            }
        }
        return true;  // If no such case was found, the array is sorted in descending order
    }

    // Main function to check if the array is sorted in any order
    public static boolean isArraySorted(int[] arr) {
        // Check if the array is sorted in either ascending or descending order
        return isSortedAscending(arr) || isSortedDescending(arr);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {1, 3, 2, 4, 5};
        
        System.out.println("Is arr1 sorted? " + isArraySorted(arr1));  // true (ascending)
        System.out.println("Is arr2 sorted? " + isArraySorted(arr2));  // true (descending)
        System.out.println("Is arr3 sorted? " + isArraySorted(arr3));  // false (not sorted)
    }
}

