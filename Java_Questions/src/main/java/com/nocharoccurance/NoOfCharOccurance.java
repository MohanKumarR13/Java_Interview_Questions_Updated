package com.nocharoccurance;

public class NoOfCharOccurance {

	public static void main(String args[]) {
		char Char;
		int count;
		String a = "Mohan";
		a = a.toLowerCase();
		for (Char = 'a'; Char <= 'z'; Char++) {
			count = 0;
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) == Char) {
					count++;
				}
			}
			System.out.println("Number of occurences of " + Char + " is " + count);
		}

	}
}