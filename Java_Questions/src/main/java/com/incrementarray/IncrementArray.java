package com.incrementarray;

public class IncrementArray {

    public static int[] incrementArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                // Set all digits after it to 0
                for (int j = i + 1; j < arr.length; j++) {
                    arr[j] = 0;
                }
                return arr;
            }
        }

        // If all digits are 9, create a new array with a carry overflow
        return new int[]{1};// Add 1 as the first element, all other elements will be 0
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 9};
        for (int num : incrementArray(arr)) {
            System.out.print(num + " ");
        }
    }
}

