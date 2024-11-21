package com.search_an_element_in_array;

import java.util.Arrays;

public class BinarySearch {
	static int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// Should be sorted order

	public static void usingOwnLogic() {
		Boolean flag = false;
		int keys = 5;
		int l = 0;
		int h = a.length - 1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (a[m] == keys) {
				System.out.println("Element Found");
				flag = true;
				break;
			}
			if (a[m] < keys) {
				l = m + 1;
			}
			if (a[m] > keys) {
				h = m - 1;
			}

		}
		if (flag == false) {
			System.out.println("Element Not Found");
		}

	}

	public static void usingArray() {
		System.out.println("Element Found At :" + Arrays.binarySearch(a, 8));
	}

	public static void main(String[] args) {
		usingOwnLogic();
		usingArray();
	}
}