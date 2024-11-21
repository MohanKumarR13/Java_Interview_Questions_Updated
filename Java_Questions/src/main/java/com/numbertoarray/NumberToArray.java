package com.numbertoarray;

import java.util.*;

public class NumberToArray {
	public static void main(String[] args) {
		int number = 12345;
		int[] digits = getDigits(number);

		// Print the array
		for (int digit : digits) {
			System.out.print(digit + " ");
		}
	}

	public static int[] getDigits(int number) {
		List<Integer> digitList = new ArrayList<>();

		// Extract digits
		while (number > 0) {
			digitList.add(0, number % 10); // Add digit to the front of the list
			number /= 10;
		}

		// Convert list to array
		int[] digits = new int[digitList.size()];
		for (int i = 0; i < digitList.size(); i++) {
			digits[i] = digitList.get(i);
		}

		return digits;
	}
}