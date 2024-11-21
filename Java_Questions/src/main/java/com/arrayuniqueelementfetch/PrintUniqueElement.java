package com.arrayuniqueelementfetch;

public class PrintUniqueElement {
	public static void main(String[] args) {
		int[] my_array = { 1, 2, 5, 5, 6, 6, 7, 2 };

		for (int i = 0; i < my_array.length; i++) {
			boolean dup = false;
			for (int j = 0; j < my_array.length; j++) {
				if (i != j && my_array[i] == my_array[j]) {
					dup = true;
					break;
				}
			}
			if (!dup) {
				System.out.println(my_array[i]);
			}
		}
	}
}
