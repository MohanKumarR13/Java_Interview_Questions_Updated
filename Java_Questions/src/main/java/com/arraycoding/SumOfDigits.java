package com.arraycoding;

import java.util.HashSet;

public class SumOfDigits {
	public static void main(String[] args) {
		int[] arr = { 9, 5, 14, 3, 1, 15, 6 };
		int target = 20;
		HashSet<Integer> seen = new HashSet<>();

		for (int num : arr) {
			if (seen.contains(target - num)) {
				System.out.println((target - num) + ", " + num);
			}
			seen.add(num);
		}
	}
}