package com.remove_leading_and_trailing_spaces;

public class RemoveLeadingAndTrailingSpaces {

	public static void main(String[] args) {
		String input = "Hi Jack";
		System.out.println(input.trim());
		System.out.println(input.replaceAll("^[ \t]+|[ \t]+$", ""));
		System.out.println(input.replaceAll("^[ \t]", ""));
		System.out.println(input.replaceAll("^[\t]+$", ""));

	}

}
