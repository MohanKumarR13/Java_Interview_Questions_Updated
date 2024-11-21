package com.find_number_of_vowels;

import java.util.*;

public class Vowels {
	public static void main(String[] args) {
		HashMap<Character, Integer> vowelMap = new HashMap<>();
		HashMap<Character, Integer> consMap = new HashMap<>();

		String s = "Mohankumar Ramasamy";
		s = s.toLowerCase();
		int others = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowelMap.put(c, vowelMap.getOrDefault(c, 0) + 1);
			} else if (c >= 'a' && c <= 'z') {
				consMap.put(c, consMap.getOrDefault(c, 0) + 1);
			} else {
				others++;
			}

		}
		System.out.println("Vowel Frequencies:");
		for (Map.Entry<Character, Integer> entry : vowelMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// Output the frequency of each consonant
		System.out.println("\nConsonant Frequencies:");
		for (Map.Entry<Character, Integer> entry : consMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// Output the count of other characters (non-alphabetic)
		System.out.println("\nOther characters count: " + others);
	}
}