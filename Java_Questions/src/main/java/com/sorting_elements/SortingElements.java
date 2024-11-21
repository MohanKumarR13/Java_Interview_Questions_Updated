package com.sorting_elements;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {
		Integer a[] = { 10, 40, 30, 20, 50 };
		System.out.println("*****Using Parallel Sorting*****");
		// Using ParallelSort
		System.out.println("Array Elements Before Sorting " + Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array Elements After Sorting " + Arrays.toString(a));
		System.out.println("*****Using Sorting*****");
		// Sort
		System.out.println("Array Elements Before Sorting " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array Elements After Sorting " + Arrays.toString(a));
		System.out.println("*****Using Reverse Descending Order Sorting*****");
		// Reverse Descending Order
		System.out.println("Array Elements Before Sorting " + Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Array Elements After Sorting " + Arrays.toString(a));

	}

}
