package com.findlargestandsmallest;

public class SmallestElement {

	public static Integer findSmallest(int[] arr) {
		if (arr.length == 0) {
			return null; // No elements in the array
		}

		int smallest = Integer.MAX_VALUE;

		for (int number : arr) {
			if (number < smallest) {
				smallest = number;
			}
		}

		return smallest;
	}

	public static void main(String[] args) {
		int[] array = { 12, 35, 1, 10, 34, 1 };
		Integer smallestElement = findSmallest(array);
		System.out.println("The smallest number is: " + smallestElement);
	}
}