package com.convert_to_lower_case;

public class ConvertToLowerCase {

	public static void main(String[] args) {
		String input = "HELLO I am Jackie Chan";
		char[] charArray = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			if (charArray[i] >= 65 && charArray[i] <= 90) {
				charArray[i] = (char) (charArray[i] + 32);
			}
		}
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
	}

}
