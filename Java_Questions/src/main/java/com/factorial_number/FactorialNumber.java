package com.factorial_number;

public class FactorialNumber {
	public static void factorialNumber_1() {
		int number = 10;
		long factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of a Number is : " + factorial);

	}

	public static void factorialNumber_2() {
		int number = 5;
		long factorial = 1;
		for (int i = number; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of a Number is : " + factorial);

	}

	public static void main(String[] args) {
		factorialNumber_1();
		factorialNumber_2();
	}
}
