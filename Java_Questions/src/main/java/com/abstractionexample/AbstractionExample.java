package com.abstractionexample;
//   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
// Abstract class
abstract class Animal {
	// Abstract method (does not have a body)
	abstract void sound();

	// Regular method
	void sleep() {
		System.out.println("The animal is sleeping.");
	}
}

// Subclass (inherits from Animal)
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

public class AbstractionExample {
	public static void main(String[] args) {
		Animal myDog = new Dog();
		Animal myCat = new Cat();

		myDog.sound(); // Output: The dog barks.
		myDog.sleep(); // Output: The animal is sleeping.

		myCat.sound(); // Output: The cat meows.
		myCat.sleep(); // Output: The animal is sleeping.
	}
}
