package com.count_the_words;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
		System.out.println("Enter the String");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine(); // Welcome Java
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of words in string : " + count);
	}

}
