package com.find_position;

import java.util.Scanner;

public class FindMyPosition {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Character :");
		char givenChar = scanner.next().charAt(0);
		Character.toLowerCase(givenChar);
		int asciiValue = (int) givenChar;
		System.out.println(asciiValue);
		int position = asciiValue - 96;
		System.out.println(position);

	}

}
