package com.sum_of_array;

public class SumOfArray {
	public static void usingForLoop() {
		int a[] = { 5, 4, 3, 7, 8 };
		int sum = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];
		}

		System.out.println("Sum Of Array Elements : " + sum);
	}

	public static void usingForEach() {
		int a[] = { 5, 4, 3, 7, 8 };
		int sum = 0;
		for (int value : a) {
			sum = sum + value;
		}

		System.out.println("Sum Of Array Elements : " + sum);
	}

	public static void main(String[] args) {
		usingForLoop();
		usingForEach();

	}

}
