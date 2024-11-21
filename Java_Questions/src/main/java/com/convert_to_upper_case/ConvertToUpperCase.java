package com.convert_to_upper_case;

public class ConvertToUpperCase {

	public static void main(String[] args) {
		String input = "hello i am jackie chan";
		char[] charArray = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			if (charArray[i] >= 97 && charArray[i] <= 122) {
				charArray[i] = (char) (charArray[i] - 32);
			}
		}
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
	}

}
