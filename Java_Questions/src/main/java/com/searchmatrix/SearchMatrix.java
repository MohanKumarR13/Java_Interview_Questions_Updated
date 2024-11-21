package com.searchmatrix;

public  class SearchMatrix {
    public static void main(String[] args) {
        // Input matrix and target value
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        int target = 5;

        // Start from the top-right corner of the matrix
        int row = 0;
        int col = matrix[0].length - 1;

        // Search for the target
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println(true);
                return;  // Exit as we found the target
            } else if (matrix[row][col] > target) {
                col--;  // Move left
            } else {
                row++;  // Move down
            }
        }

        // If the target was not found
        System.out.println(false);
    }
}
