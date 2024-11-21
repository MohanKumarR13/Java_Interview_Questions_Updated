package com.tripletsum;

import java.util.HashSet;
import java.util.Set;

public class TripletSum {

	// Function to find triplets in an array where the sum of two elements equals
	// the target
	public static void findTriplets(int[] a, int target) {
		// Iterate over each element in the array
		for (int i = 0; i < a.length - 1; i++) {
			// Set to track elements we've seen for pair checking
			Set<Integer> set = new HashSet<>();
			int currentTarget = target - a[i]; // Target sum for the pair

			// Check for pairs in the rest of the array
			for (int j = i + 1; j < a.length; j++) {
				// If the complement is in the set, we've found a valid triplet
				if (set.contains(currentTarget - a[j])) {
					System.out.println("Triplet: (" + a[i] + ", " + a[j] + ", " + (currentTarget - a[j]) + ")");
				}
				// Add the current element to the set for future pair checking
				set.add(a[j]);
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 5, 6, 7, 9 }; // Example array
		int target = 12; // Example target value

		System.out.println("Triplets with sum equal to " + target + ":");
		findTriplets(a, target);
	}
}
