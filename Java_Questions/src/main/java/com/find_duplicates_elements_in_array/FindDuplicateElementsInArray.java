package com.find_duplicates_elements_in_array;

import java.util.HashSet;

public class FindDuplicateElementsInArray {
	static String arr[] = { "Java", "C", "C++", "Python", "Java" };

	public static void usingBoolean() {
		Boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Found Duplicate Element : " + arr[i]);
					flag = true;
				}
			}
		}
		if (flag == false)
			System.out.println("Duplicate Element Not Found");
	}

	public static void usingHashSet() {
		HashSet<String> hashSet = new HashSet<String>();
		/*
		 * System.out.println(hashSet.add("Java"));
		 * System.out.println(hashSet.add("Python"));
		 * System.out.println(hashSet.add("Java"));
		 */
		Boolean flag = false;
		for (String str : arr) {
			if (hashSet.add(str) == false) {
				System.out.println("Found Duplicate Element :" + str);
				flag = true;
			}
		}
		if (flag == false)
			System.out.println("Not Found Duplicates");

	}

	public static void main(String[] args) {
		// usingBoolean();
		usingHashSet();
	}

}
