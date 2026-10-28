package java8;

public class all {
	static class A extends Thread {
		public void run() {
			for (int i = 1; i <= 10; i++) {
				System.out.println("hello");
			}
		}
	}

	static class B extends Thread {
		public void run() {
			for (int i = 0; i <= 10; i++) {
				System.out.println("hi");
			}
		}
	}

	public static void main(String[] args) {
		A myobj = new A();
		B myobj1 = new B();
		myobj.start();
		myobj.setPriority(5);
		myobj1.start();

	}
}