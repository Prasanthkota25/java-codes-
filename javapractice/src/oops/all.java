package oops;

public class all {

	/* Method Over loading (compile-time polymorphism ) */

//	static class calculator {
//		int add(int a, int b) {
//			return a + b;
//		}
//
//		int add(int a, int b, int c) {
//			return a + b + c;
//		}
//
//		double add(double a, double b) {
//			return a + b;
//		}
//
//		public static void main(String[] args) {
//			calculator mycal = new calculator();
//
//			System.out.println(mycal.add(5, 6));
//			System.out.println(mycal.add(10, 20, 30));
//			System.out.println(mycal.add(5.5, 4.5));
//		}
//	}

	/* Method Overriding ( run-time polymorphism) */
	
	
//	static class animals {
//		void sound() {
//			System.out.println("Animals makes Sound ");
//		}
//
//		static class dog extends animals {
//			@Override
//			void sound() {
//				System.out.println("Dog barks");
//			}
//		}
//
//		static class cat extends animals {
//			@Override
//			void sound() {
//				System.out.println("cat Meows ");
//			}
//		}
//
//		public static void main(String[] args) {
//
//			animals a = new animals();
//			a.sound();
//
//			a = new dog();
//			a.sound();
//			a = new cat();
//			a.sound();
//
//		}
//	}

	/* Abstract method */

//	static abstract class vehical {
//		abstract void start();
//
//		void starts() {
//			System.out.println("vehical starts ...");
//		}
//	}
//
//	static class car extends vehical {
//		@Override
//		void start() {
//			System.out.println("car stars with key ");
//		}
//	}
//
//	public static void main(String[] args) {
//
//		vehical v = new car();
//		v.start();
//		v.starts();
//	}

	/* interface method */

//	static interface animal {
//		void sound();
//
//	}
//
//	static class dog implements animal {
//		@Override
//		public void sound() {
//			System.out.println("dog barks ");
//		}
//	}
//
//	public static void main(String[] args) {
//		animal a = new dog();
//		a.sound();
//	}
}