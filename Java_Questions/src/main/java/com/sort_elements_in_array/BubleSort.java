package com.sort_elements_in_array;

import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {
		int a[] = { 2, 4, 1, 3, 5 };

		System.out.println("Array Before Sorting : " + Arrays.toString(a));
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {// Number of Passes
			for (int j = 0; j < n - 1; j++) {// Iterations
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}
		System.out.println("Array After Sorting : " + Arrays.toString(a));

	}
}