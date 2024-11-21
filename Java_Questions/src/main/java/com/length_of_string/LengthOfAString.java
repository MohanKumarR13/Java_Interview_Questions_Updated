package com.length_of_string;

public class LengthOfAString {

	public static void main(String[] args) {
		String given_String = "MohanKumar";
		/* System.out.println(given_String.length()); */
		char charArray[] = given_String.toCharArray();
		int length = 0;
		for (@SuppressWarnings("unused")
		char c : charArray) {
			length++;
		}
		System.out.println(length); 
	}

}
