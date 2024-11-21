package com.stringrotation;

public class StringRotation {
	// Function to check if str2 is a rotation of str1
	static boolean areRotations(String str1, String str2) {
		// Check if lengths are equal and str2 is a substring of str1 concatenated with
		// itself
		return (str1.length() == str2.length()) && ((str1 + str1).contains(str2));
	}

	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "CDAB";

		if (areRotations(str1, str2)) {
			System.out.println("Strings are rotations of each other");
		} else {
			System.out.println("Strings are not rotations of each other");
		}
	}
}