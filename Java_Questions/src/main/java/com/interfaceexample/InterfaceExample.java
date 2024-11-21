package com.interfaceexample;

// Interface
interface Shape {
	void draw(); // Abstract method
}

// Implementing the interface in classes
class Circle implements Shape {
	public void draw() {
		System.out.println("Drawing a circle.");
	}
}

class Rectangle implements Shape {
	public void draw() {
		System.out.println("Drawing a rectangle.");
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		Shape myCircle = new Circle();
		Shape myRectangle = new Rectangle();

		myCircle.draw(); // Output: Drawing a circle.
		myRectangle.draw(); // Output: Drawing a rectangle.
	}
}