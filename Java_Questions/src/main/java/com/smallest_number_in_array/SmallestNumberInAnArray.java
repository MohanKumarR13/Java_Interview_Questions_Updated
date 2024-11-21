package com.smallest_number_in_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumberInAnArray {
	Integer givenArray[] = { 2, 1, 5, 4, 3 };

	public void findSmallest() {
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < givenArray.length; i++) {
			if (givenArray[i] < smallest) {
				smallest = givenArray[i];
			}
		}
		System.out.println("Smallest Number is : " + smallest);
	}

	// Using Arrays
	public void usingArrays() {
		Arrays.sort(givenArray);
		System.out.println("Smallest Number is : " + givenArray[0]);
	}

	// Using Collections
	public void usingCollections() {
		List<Integer> list = Arrays.asList(givenArray);
		Collections.sort(list);
		int smallest = list.get(0);
		System.out.println("Smallest Number is : " + smallest);
	}

	public static void main(String[] args) {
		SmallestNumberInAnArray smallestNumberInAnArray = new SmallestNumberInAnArray();
		smallestNumberInAnArray.findSmallest();
		smallestNumberInAnArray.usingArrays();
		smallestNumberInAnArray.usingCollections();
	}

}
