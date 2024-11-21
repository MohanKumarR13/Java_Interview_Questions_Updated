package com.extract_numbers_from_string_and_add;

// Java implementation of the approach
public class ExtractNumberFromString {

	// Function to return the modified string
	static String extractInt(String str) {
		// Replacing every non-digit number
		// with a space(" ")
		str = str.replaceAll("[^0-9]", " "); // regular expression

		// Replace all the consecutive white
		// spaces with a single space
		str = str.replaceAll(" +", " ");

		if (str.equals(""))
			return "-1";

		return str;
	}

	// Driver code
	public static void main(String[] args) {
		String str = "avbkjd1122klj4 543 af";
		System.out.print(extractInt(str));
	}
}
