package com.carspeedcalculation;

public class CarSpeed {
	public static void main(String[] args) {
		double initialSpeed = 57.0; // initial speed in km/hr
		double speedIncrease = 3.0; // speed increase in km/hr per hour
		int totalHours = 7; // total hours of the journey
		double totalDistance = 0.0; // variable to accumulate total distance

		for (int hour = 1; hour <= totalHours; hour++) {
			// Calculate distance for this hour
			totalDistance += initialSpeed;
			// Increase speed for the next hour
			initialSpeed += speedIncrease;
		}

		// Output the total distance covered
		System.out.println("Total distance covered after " + totalHours + " hours: " + totalDistance + " km");
	}
}
