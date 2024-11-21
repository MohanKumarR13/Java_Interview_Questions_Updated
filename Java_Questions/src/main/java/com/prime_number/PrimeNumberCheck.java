package com.prime_number;

public class PrimeNumberCheck {
	static boolean isPrime(int a) {
		if (a <= 1)
			return false;
		for (int i = 2; i < a; i++)
			if (a % i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Hello World" + isPrime(11));
	}
}