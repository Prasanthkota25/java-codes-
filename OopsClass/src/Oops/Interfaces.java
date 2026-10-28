package Oops;

public class Interfaces {

	interface Animal {
		void makeSound();
	}

	static class Dog implements Animal {
		public void makeSound() {
			System.out.println("Dog barks...");
		}
	}

	public static void main(String[] args) {
		Animal myDog = new Dog();
		myDog.makeSound();
	}
}
