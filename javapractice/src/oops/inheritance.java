package oops;

public class inheritance {

	/* Simple Example of Inheritance */
//	static class animal {
//		void sound() {
//			System.out.println("Animal is eating  ");
//		}
//	}
//
//	static class dog extends animal {
//		void bark() {
//			System.out.println("dog is barking ");
//		}
//	}
//
//	public static void main(String[] args) {
//		dog a = new dog();
//		a.sound();
//		a.bark();
//	}

	/* Multilevel Inheritance */
	static class animal {
		void eat() {
			System.out.println("Animal is eating ");
		}
	}

	static class dog extends animal {
		void bark() {
			System.out.println("dog is barking ");
		}
	}

	static class puppy extends dog {
		void shouting() {
			System.out.println("puppy is  shouting ");
		}
	}

	public static void main(String[] args) {
		puppy myanimal = new puppy();
		myanimal.eat();
		myanimal.bark();

		myanimal.shouting();

	}

	/* Hierarchical Inheritance */

//	static class animal {
//		void eat() {
//			System.out.println("animals are eating ");
//		}
//	}
//
//	static class dog extends animal {
//		void bark() {
//			System.out.println("dog is barking ");
//		}
//	}
//
//	static class cat extends animal {
//		void shout() {
//			System.out.println("cat shouts meow ");
//		}
//	}
//
//	public static void main(String[] args) {
//
//		dog d = new dog();
//		d.eat();
//		d.bark();
//
//		cat c = new cat();
//		c.eat();
//		c.shout();
//
//	}

	/* Important Keywords in Inheritance */

//	static class animal {
//		String colour = "black";
//	}
//
//	static class dog extends animal {
//		String colour = "white ";
//
//		void printcolour() {
//			System.out.println(super.colour);
//			System.out.println(colour);
//		}
//
//	}
//
//	public static void main(String[] args) {
//		dog d = new dog();
//		d.printcolour();
//	}
}
