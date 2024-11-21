package com.charactercombinations;

import java.util.ArrayList;
import java.util.List;

public class CharacterCombinations {
	public static void main(String[] args) {
		String input = "I Love Dogs";
		List<String> combinations = generateCombinations(input);

		// Print the results
		for (String combination : combinations) {
			System.out.println(combination);
		}
	}

	private static List<String> generateCombinations(String input) {
		// Remove spaces for combinations
		String cleanedInput = input.replace(" ", "");
		List<String> results = new ArrayList<>();

		// Generate combinations
		for (int i = 0; i < cleanedInput.length(); i++) {
			for (int j = 0; j < cleanedInput.length(); j++) {
				if (i != j) { // Ensure characters are not the same
					results.add("" + cleanedInput.charAt(i) + cleanedInput.charAt(j));
				}
			}
		}

		return results;
	}
}
