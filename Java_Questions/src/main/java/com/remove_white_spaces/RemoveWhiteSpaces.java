package com.remove_white_spaces;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "Java Programming Selenium Automation";
		System.out.println("Before Removing the White Spaces : " + str);
		str = str.replaceAll("\\s", "");
		System.out.println("After Removing the White Spaces : " + str);

	}

}
