package com.findlargestandsmallest;

public class SecondLargest {

	public static Integer findSecondLargest(int[] arr) {
		if (arr.length < 2) {
			return null; // Not enough elements
		}

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int number : arr) {
			if (number > first) {
				second = first;
				first = number;
			} else if (number > second && number < first) {
				second = number;
			}
		}

		return second == Integer.MIN_VALUE ? null : second;
	}

	public static void main(String[] args) {
		int[] array = { 12, 35, 1, 10, 34, 1 };
		Integer secondLargest = findSecondLargest(array);
		System.out.println("The second largest number is: " + secondLargest);
	}
}
