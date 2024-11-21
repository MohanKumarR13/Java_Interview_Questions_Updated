package com.fibonacci_series;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int numer_1 = 0;
		int number_2 = 1;
		int sum = 0;
		System.out.println(numer_1 + " " + number_2);
		for (int i = 2; i < 10; i++) {
			sum = numer_1 + number_2;
			System.out.print(" " + sum);
			numer_1 = number_2;
			number_2 = sum;
		}

	}

}
