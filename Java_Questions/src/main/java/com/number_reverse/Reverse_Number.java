package com.number_reverse;

import java.util.Scanner;

public class Reverse_Number {
	public static void usingScanner() {
		int given_Number = 0;
		int reverse_Number = 0;
		// Scanner
		System.out.println("Enter Your Number");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		given_Number = scanner.nextInt();
		while (given_Number != 0) {
			reverse_Number = reverse_Number * 10;
			reverse_Number = reverse_Number + given_Number % 10;
			given_Number = given_Number / 10;

			/* System.out.println(123%10); System.out.println(123/10); */

		}
		System.out.println(reverse_Number);
	}

	public static void usingStringBuffer() {
		int given_Number = 0;
		// Scanner
		System.out.println("Enter Your Number");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		given_Number = scanner.nextInt();
		StringBuffer buffer = new StringBuffer(String.valueOf(given_Number));
		StringBuffer reverse_Number = buffer.reverse();
		System.out.println(reverse_Number);
	}

	public static void usingStringBuilder() {
		int given_Number = 0;
		// Scanner
		System.out.println("Enter Your Number");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		given_Number = scanner.nextInt();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(given_Number);
		StringBuilder reverse_Number = stringBuilder.reverse();
		System.out.println(reverse_Number);
	}

	public static void main(String[] args) {
		usingScanner();
		usingStringBuffer();
		usingStringBuilder();

	}
}
