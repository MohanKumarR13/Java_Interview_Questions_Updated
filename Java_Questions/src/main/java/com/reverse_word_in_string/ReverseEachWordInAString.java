package com.reverse_word_in_string;

public class ReverseEachWordInAString {
	public static void reverse_each_word() {
		String str = "Welcome To Java"; // Original String
		String[] words = str.split(" "); // Splitting String into words
		String reverseString = "";
		for (String w : words) {
			String reverseWord = "";

			for (int i = w.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + w.charAt(i);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println(reverseString);

	}

	public static void reverse_each_word_using_stringBuffer() {
		String str = "Welcome To Java"; // Original String
		String[] words = str.split("\\s"); // Splitting String into words
		String reverseWord = "";
		for (String w : words) {
			StringBuilder stringBuilder = new StringBuilder(w);
			stringBuilder.reverse();
			reverseWord = reverseWord + stringBuilder.toString() + " ";
		}
		System.out.println(reverseWord);
	}

	public static void main(String[] args) {
		reverse_each_word();
		reverse_each_word_using_stringBuffer();
	}
}