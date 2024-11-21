package com.search_an_element_in_array;

public class LinearSearch {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		int search_element = 50;
		Boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			/* System.out.println(a[i]); */
			if (search_element == a[i]) {
				System.out.println("Element Found At : " + i);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Element Not Found");
		}
	}

}
