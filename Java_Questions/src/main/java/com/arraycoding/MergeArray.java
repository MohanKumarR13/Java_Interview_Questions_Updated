package com.arraycoding;

import java.util.*;

public class MergeArray {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] a1 = { 1, 3, 5, 7 };
		int[] a2 = { 2, 4, 6, 8 };
		int merge[] = new int[a1.length + a2.length];
		System.arraycopy(a1, 0, merge, 0, a1.length);
		System.arraycopy(a2, 0, merge, a1.length, a2.length);
		Arrays.sort(merge);
		System.out.println(Arrays.toString(merge));

	}
}
