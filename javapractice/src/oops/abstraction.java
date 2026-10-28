package oops;

public class abstraction {

	static abstract class animal {
		abstract void sound();

		void eat() {
			System.out.println("Animal is Eating ");
		}
	}

	static class dog extends animal {
		@Override
		void sound() {
			System.out.println("Dog bakrs ");
		}
	}

	public static void main(String[] args) {
		animal myobj = new dog();

		myobj.sound();
		myobj.eat();
	}
}
