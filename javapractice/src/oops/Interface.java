package oops;

public class Interface {

	static interface vehicle {
		void start();
	}

	static class car implements vehicle {
		@Override
		public void start() {
			System.out.println("vehicle starts with key ...");
		}
	}

	public static void main(String[] args) {
		vehicle v = new car();
		v.start();
	}
}
