package com.findlargestandsmallest;

public class LargestElement {

	public static Integer findLargest(int[] arr) {
		if (arr.length == 0) {
			return null; // No elements in the array
		}

		int largest = Integer.MIN_VALUE;

		for (int number : arr) {
			if (number > largest) {
				largest = number;
			}
		}

		return largest;
	}

	public static void main(String[] args) {
		int[] array = { 12, 35, 1, 10, 34, 1 };
		Integer largestElement = findLargest(array);
		System.out.println("The largest number is: " + largestElement);
	}
}