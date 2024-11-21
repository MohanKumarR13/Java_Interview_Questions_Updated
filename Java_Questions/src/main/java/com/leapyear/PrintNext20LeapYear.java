package com.leapyear;

public class PrintNext20LeapYear {

	public static void main(String[] args) {
		int year = 2024; // Starting year
		int count = 0; // Counter for leap years

		while (count < 20) {
			if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
				System.out.println(year);
				count++;
			}
			year++;
		}
	}
}