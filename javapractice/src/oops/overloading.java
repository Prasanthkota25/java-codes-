package oops;

public class overloading {

	static class calculator {
		int add(int a, int b) {
			return a + b;
		}

		int add(String c, int d) {
			return   Integer.parseInt(c) + d;
		}

		double add(double a, double b) {
			return a + b;
		}

		public static void main(String[] args) {

			calculator mycal = new calculator();

			System.out.println(mycal.add(5, 6));
			System.out.println(mycal.add(10,  30));
			System.out.println(mycal.add(5.5, 4.5));
		}

	}
}
