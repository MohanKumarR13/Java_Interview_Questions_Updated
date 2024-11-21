package com.array_contains_element_or_not;

import java.util.stream.IntStream;

public class ArrayContainsElementOrNot {

	int[] array = { 1, 2, 3, 3, 4, 5 };
	int numberToFind = 3;
	boolean found = false; 

	public void presentOrNot() {
		for (int number : array) {
			if (number == numberToFind) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Number Present");
		} else {
			System.out.println("Number Not Present");
		}
	}

	// IntStream
	public void usingIntStream() {
		boolean found = IntStream.of(array).anyMatch(element -> element == numberToFind);
		if (found) {
			System.out.println("Number Present");
		} else {
			System.out.println("Number Not Present");
		}
	}

	public static void main(String[] args) {
		ArrayContainsElementOrNot arrayContainsElementOrNot = new ArrayContainsElementOrNot();
		arrayContainsElementOrNot.presentOrNot();
		arrayContainsElementOrNot.usingIntStream();
	}
}