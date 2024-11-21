package com.find_missing_alphabet_string;

public class FindMissingAlphabetInaStr {
	public static void main(String[] args) {
		String s = "a";
		for (char c = 'a'; c <= 'z'; c++) {
			if (s.toLowerCase().indexOf(c) == -1) {
				System.out.println(c);
			}
		}
	}
}