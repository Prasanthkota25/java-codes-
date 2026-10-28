package javaStrings;

public class exceptionhandling {

	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 0;
			int result = a / b;

		} catch (ArithmeticException e) {
			System.out.println("Error occoured ");
		} finally {
			System.out.println("it is working ");
		}

	}
}
