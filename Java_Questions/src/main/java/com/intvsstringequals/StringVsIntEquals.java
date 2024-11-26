package com.intvsstringequals;

public class StringVsIntEquals {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 128;
		int d = 128;
		System.out.println(a==b);
		System.out.println(c==d);

		if (a == b) {
			System.out.println("A  is EQUAL to B");
		} else {
			System.out.println("A is NOT EQUAL to B");

		}

		if (c == d) {
			System.out.println("C is EQUAL to D");
		} else {
			System.out.println("C is NOT EQUAL to D");

		}

		String s1 = "Mohan";
		String s2 = "Mohan";
		String s3 = new String("Mohan");

		if (s1 == s2) {
			System.out.println(s1 + "  is EQUAL to " + s2);
		} else {
			System.out.println(s1 + " is NOT EQUAL to " + s2);

		}

		if (s1 == s3) {
			System.out.println(s1 + "  is EQUAL(=) to " + s3);
		} else {
			System.out.println(s1 + " is NOT EQUAL to " + s3);

		}
		if (s1.equals(s3)) {
			System.out.println(s1 + "  is EQUAL(equals) to " + s3);
		} else {
			System.out.println(s1 + " is NOT EQUAL to " + s3);

		}

	}
}
