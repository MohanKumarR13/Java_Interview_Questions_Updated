package com.prime_number;

public class Prime_Number {

	public static void main(String[] args) {
		int number = 2;
		int count = 0;
		if (number > 1) {
			for (int i = 1; i <= number; i++) {
				if (number % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not Prime Number");

			}
		} else {
			System.out.println("Not Prime Number");

		}

	}

}
