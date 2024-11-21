package com.check_array_equals;

import java.util.Arrays;

public class CheckArrayEquals {
	static int array_1[] = { 1, 2, 3, 4, 5 };
	static int array_2[] = { 1, 2, 3, 4, 5 };

	public static void approch_1() {
		boolean status = Arrays.equals(array_1, array_2);
		if (status == true) {
			System.out.println("Arrays are Equal");
		} else {
			System.out.println("Arrays are Not Equal");
		}

	}

	public static void approch_2() {
		boolean status = true;
		if (array_1.length == array_2.length) {
			for (int i = 0; i < array_1.length; i++) {
				if (array_1[i] != array_2[i]) {
					status = true;
				}
			}

		} else {
			status = false;
		}
		if (status == true)
			System.out.println("Arrays are Equal");
		else {
			System.out.println("Arrays are Not Equal");

		}
	}

	public static void main(String[] args) {
		approch_1();
		approch_2();

	}

}
