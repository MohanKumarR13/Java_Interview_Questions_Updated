package com.abstractionprogramexample;

abstract class Animal {
	abstract void sound();

	void sleep() {
		System.out.println("The animal is sleeping.");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("The dog barks.");
	}
}

class Cat extends Animal {
	void sound() {
		System.out.println("The cat meows.");
	}
}

public class ExampleAbstractionExample {
	public static void main(String[] args) {
		Animal myDog = new Dog();
		Animal myCat = new Cat();

		myDog.sound(); // Output: The dog barks.
		myDog.sleep(); // Output: The animal is sleeping.

		myCat.sound(); // Output: The cat meows.
		myCat.sleep(); // Output: The animal is sleeping.
	}
}
