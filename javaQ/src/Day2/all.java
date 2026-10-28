package Day2;

public class all {

	// Method overloading

//	static class printer {
//
//		int print(int num) {
//			return num;
//		}
//
//		String print(String text) {
//			return text;
//		}
//
//		double print(double num) {
//			return num;
//		}
//	}
//
//	public static void main(String[] args) {
//		printer myprint = new printer();
//		System.out.println(myprint.print(25));
//		System.out.println(myprint.print("prasanth kota"));
//		System.out.println(myprint.print(2525));
//
//	}

	// method overriding

//	static class animal {
//
//		void Sound() {
//			System.out.println("animal is shouting ");
//		}
//	}
//
//	static class Dog extends animal {
//		@Override
//		void Sound() {
//			System.out.print("Dog is barking ");
//		}
//	}
//
//	public static void main(String[] args) {
//
//		Dog myanimal = new Dog();
//		myanimal.Sound();
//
//	}

	// abstract

//	static abstract class Animal {
//		abstract void sound();
//
//		void eat() {
//			System.out.println("Eating .....");
//		}
//
//		static class myDog extends Animal {
//			@Override
//			void sound() {
//				System.out.println("my dog is barking ");
//			}
//		}
//
//		public static void main(String[] args) {
//
//			Animal mydog = new myDog();
//			mydog.eat();
//			mydog.sound();
//		}
//	}

	// interface

	interface flyable {
		void fly();
	}

	static class birds implements flyable {
		public void fly() {
			System.out.println("All birds are flying in the sky ....");
		}
	}

	public static void main(String[] args) {
		flyable mybird = new birds();
		mybird.fly();

	}
}
