package com.replace_vowels_with_stars;

public class ReplaceVowelsWithStars {
	public static void method1() {
		String givenText = "I Love Cartoons";
		char[] charArray = givenText.toCharArray();
		for (int i = 0; i < givenText.length(); i++) {
			if (givenText.charAt(i) == 'A' || givenText.charAt(i) == 'E' || givenText.charAt(i) == 'I'
					|| givenText.charAt(i) == 'O' || givenText.charAt(i) == 'U' || givenText.charAt(i) == 'a'
					|| givenText.charAt(i) == 'e' || givenText.charAt(i) == 'i' || givenText.charAt(i) == 'o'
					|| givenText.charAt(i) == 'u')
				charArray[i] = '*';

		}
		for (int i = 0; i < givenText.length(); i++) {
			{
				System.out.print(charArray[i]);
			}
		}
	}

	public static void method2() {
		String givenText = "I Love Cartoons";
		String replaceText = givenText.replaceAll("[AEIOUaeiou]", "\\$");
		System.out.print(replaceText);
	}

	public static void main(String[] args) {
		method1();
		method2();
	}
}