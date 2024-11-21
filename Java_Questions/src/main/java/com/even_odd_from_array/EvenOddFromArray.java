package com.even_odd_from_array;

public class EvenOddFromArray {
	public static void usingForLoop() {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		// Extractiong Even Numbers
		System.out.println("Even Numbers in Array.....");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.println(a[i]);
		}
		System.out.println("Odd Numbers In Array.....");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0)
				System.out.println(a[i]);

		}
	}

	public static void usingForEach() {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		// Extractiong Even Numbers
		System.out.println("Even Numbers in Array.....");
		for (int value : a) {
			if (value % 2 == 0)
				System.out.println(value);
		}
		System.out.println("Odd Numbers In Array.....");
		for (int value : a) {
			if (value % 2 != 0)
				System.out.println(value);

		}
	}

	public static void main(String[] args) {
		usingForLoop();
		usingForEach();

	}

}
