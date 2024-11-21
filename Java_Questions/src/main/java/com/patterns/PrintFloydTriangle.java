package com.patterns;

import java.util.Scanner;

public class PrintFloydTriangle {
	public void triangle1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number of Lines : ");
		int numberOfLines = scanner.nextInt();
		int row, column = 0;
		for (row = 0; row < numberOfLines; row++) {
			for (column = 0; column <= row; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void triangle2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Rows : ");

		int startingNumber = 1;
		int limit;
		limit = scanner.nextInt();
		int row, column;
		for (row = 0; row < limit; row++) {
			for (column = 0; column <= row; column++) {
				System.out.print(startingNumber + " ");
				startingNumber = startingNumber + 1;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PrintFloydTriangle floydTriangle = new PrintFloydTriangle();
		floydTriangle.triangle1();
		floydTriangle.triangle2();

	}
}