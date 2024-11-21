package com.palindrome_number;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = scanner.nextInt();
		int original_Number = number;
		int reverse = 0;
		while (number != 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		if (original_Number == reverse) {
			System.out.println(original_Number + " Palinrome Number");
		} else {
			System.out.println(original_Number + " Not Palinrome Number");

		}
	}

}
