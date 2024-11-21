package com.max_min_elements_in_array;

public class MaxAndMinElementsInArray {
	static int a[] = { 50, 100, 40, 20, 60 };

	public static void findMaxValue() {

		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println("Maximum Element is Array is " + max);
	}

	public static void findMinValue() {

		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];
		}
		System.out.println("Minimum Element is Array is " + min);
	}

	public static void main(String[] args) {
		findMaxValue();
		findMinValue();
	}

}
