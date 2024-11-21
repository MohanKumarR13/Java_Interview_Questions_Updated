package com.find_number_of_vowels;

public class CountTheVowelsinYourName {

	public static void main(String[] args) {
		String input = "MohanKumar";
		int vowelsCount = 0;
		input = input.toLowerCase();
		int length = input.length();
		for (int i = 0; i < length; i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u') {
				vowelsCount++;
			}
		}
		System.out.println("Your Name has " + vowelsCount + " Vowels(s)");
	}

}
