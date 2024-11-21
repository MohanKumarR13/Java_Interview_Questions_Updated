package com.printoutput;

public class Main {
	static String print(String s, int a) {
		String out = "";
		for (int i = 0; i < a; i++) {
			out += s;
		}
		return out;
	}

	public static void main(String[] args) {
		System.out.print(print("a", 1));
		System.out.print(print("b", 2));
		System.out.print(print("c", 3));
		System.out.print(print("d", 4));

	}
}