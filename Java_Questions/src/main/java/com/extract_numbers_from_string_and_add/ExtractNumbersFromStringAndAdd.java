package com.extract_numbers_from_string_and_add;

public class ExtractNumbersFromStringAndAdd {

	public static void main(String[] args) {
		String input = "MohanKumar13";
		int total = 0;
		int length = input.length();
		for (int i = 0; i < length; i++) {
			char character = input.charAt(i);
			if (Character.isDigit(character)) {
				total = total + Character.getNumericValue(character);
			}
		}
		System.out.println(total);

	}

}
