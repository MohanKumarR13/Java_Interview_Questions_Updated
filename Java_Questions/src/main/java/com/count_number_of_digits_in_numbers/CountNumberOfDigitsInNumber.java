package com.count_number_of_digits_in_numbers;

public class CountNumberOfDigitsInNumber {

	public static void main(String[] args) {
		int number = 123456;
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		System.out.println("Number Of Digits : " + count);
	}

}
