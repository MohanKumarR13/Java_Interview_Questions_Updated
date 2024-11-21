package com.largest_of_numbers;

import java.util.Scanner;

public class LargestOfNumbers {
	public static void ternaryOperator() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int first_Number = scanner.nextInt();
		System.out.println("Enter Second Number : ");
		int second_Number = scanner.nextInt();
		System.out.println("Enter Third Number : ");
		int third_Number = scanner.nextInt();
		int largest = third_Number > (first_Number > second_Number ? first_Number : second_Number) ? third_Number
				: (first_Number > second_Number ? first_Number : second_Number);
		System.out.println(largest + " is Largest Number");
	}

	public static void ownLogic() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int first_Number = scanner.nextInt();
		System.out.println("Enter Second Number : ");
		int second_Number = scanner.nextInt();
		System.out.println("Enter Third Number : ");
		int third_Number = scanner.nextInt();

		if (first_Number > second_Number && first_Number > third_Number) {
			System.out.println(first_Number + " is Largest Number");
		} else if (second_Number > first_Number && second_Number > third_Number) {
			System.out.println(second_Number + " is Largest Number");
		} else {
			System.out.println(third_Number + " is Largest Number");

		}

	}

	public static void main(String[] args) {
		ternaryOperator();
		ownLogic();
	}

}
