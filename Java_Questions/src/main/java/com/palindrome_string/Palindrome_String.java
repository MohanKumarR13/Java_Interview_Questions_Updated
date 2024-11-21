package com.palindrome_string;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your String : ");
		String str = scanner.next();
		String original_String = str;
		String reverse = "";
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		if (original_String.equals(reverse)) {
			System.out.println(original_String + " Palinrome String");
		} else {
			System.out.println(original_String + " Not Palinrome String");

		}
	}

}
