package com.find_occurance_of_char_string;

public class FindOccuranceOfACharInString {
	public static void usingIteration() {
		String input = "MohanKumar";
		char toFind = 'm';
		int occurance = 0;
		input = input.toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == toFind) {
				occurance = occurance + 1;
			}
		}
		System.out.println(toFind + " is present " + occurance + " number of times");
	}

	public static void withOutIteration() {
		String input = "MohanKumar";
		char toFind = 'm';
		input = input.toUpperCase();
		String charToFind = Character.toString(toFind).toUpperCase();
		int actualLength = input.length();
		System.out.println(actualLength);
		input = input.replace(charToFind, "");
		int lengthAfterReplaceing = input.length();
		System.out.println(lengthAfterReplaceing);
		System.out.println(actualLength - lengthAfterReplaceing);
	}

	public static void countCharacterOccurance() {
		String str = "Java Learning";
		int totalCount = str.length();// Total Length
		int totalCount_AfterRemove = str.replace("a", "").length();
		int count = totalCount - totalCount_AfterRemove;
		System.out.println("Number Of Occurance of a is :" + count);
	}

	public static void main(String[] args) {
		usingIteration();
		withOutIteration();
		countCharacterOccurance();
	}
}