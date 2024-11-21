package com.missing_number_in_array;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int a[] = { 2, 1, 4, 5 };
		int sum_1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum_1 = sum_1 + a[i];
		}
		System.out.println("Sum of Elements in Array : " + sum_1);
		int sum_2 = 0;
		for (int i = 1; i <= 5; i++) {
			sum_2 = sum_2 + i;
		}
		System.out.println("Sum of Range of Elements in Array : " + sum_2);
		System.out.println("Missing Number is " + (sum_2 - sum_1));

	}

}
