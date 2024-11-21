package com.findlargestandsmallest;

public class SecondSmallestElement {

	public static Integer findSecondSmallest(int[] arr) {
		if (arr.length < 2) {
			return null; // Not enough elements
		}

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int number : arr) {
			if (number < smallest) {
				secondSmallest = smallest;
				smallest = number;
			} else if (number > smallest && number < secondSmallest) {
				secondSmallest = number;
			}
		}

		return secondSmallest == Integer.MAX_VALUE ? null : secondSmallest;
	}

	public static void main(String[] args) {
		int[] array = { 12, 35, 1, 10, 34, 1 };
		Integer secondSmallestElement = findSecondSmallest(array);
		System.out.println("The second smallest number is: " + secondSmallestElement);
	}
}