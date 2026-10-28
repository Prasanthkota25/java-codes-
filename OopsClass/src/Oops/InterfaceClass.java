package Oops;

public class InterfaceClass {

	interface Animals {
		void MakeSound();
	}

	static class Dog implements Animals {
		public void MakeSound() {
			System.out.println("bow bow ....");
		}
	}

	static class Cat implements Animals {
		public void MakeSound() {
			System.out.println("meow meow...");
		}
	}

	public static void main(String[] args) {
		Animals myDog = new Dog();
		Animals myCat = new Cat();
		myCat.MakeSound();
		myDog.MakeSound();

	}
}