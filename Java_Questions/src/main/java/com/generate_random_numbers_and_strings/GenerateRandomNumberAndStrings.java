package com.generate_random_numbers_and_strings;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumberAndStrings {
	// Approch-1
	public static void usingRandom() {
		Random random = new Random();
		random.nextInt();
		int random_int = random.nextInt(10000);
		System.out.println(random_int);
		double random_double = random.nextDouble();// range 0.0 and less than 1.0
		System.out.println(random_double);
	}

	// Approch-2
	public static void usinhMath() {
		System.out.println(Math.random());
	}

	// Approch-3
	public static void usingApacheCommonsLang() {
		String random_Number_Variable = RandomStringUtils.randomNumeric(5);
		System.out.println(random_Number_Variable);
		String random_Alphabetic = RandomStringUtils.randomAlphabetic(5);
		System.out.println(random_Alphabetic);
	}

	public static void main(String[] args) {
		usingRandom();
		usinhMath();
		usingApacheCommonsLang();

	}

}
