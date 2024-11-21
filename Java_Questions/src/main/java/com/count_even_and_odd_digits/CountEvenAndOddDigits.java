package com.count_even_and_odd_digits;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		int number = 12345;
		int even_count = 0;
		int odd_count = 0;
		while (number > 0) {
			int reminder = number % 10;
			if (reminder % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			number = number / 10;
		}
		System.out.println("Number Of Even Numbers : " + even_count);
		System.out.println("Number Of Odd Numbers : " + odd_count);

	}

}
