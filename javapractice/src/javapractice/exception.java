package javapractice;

public class exception {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int result = a / b;
		} catch (ArithmeticException e) {
			System.out.println("error our occured ");
		} finally {
			System.out.println("this is always  run ");
		}
	}
}
