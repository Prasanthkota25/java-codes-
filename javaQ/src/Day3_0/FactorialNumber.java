package Day3_0;

import java.util.Scanner;

public class FactorialNumber {
	static class factorialThread extends Thread {
		int n;

		factorialThread(int n) {
			this.n = n;
		}

		public void run() {
			try {
				long Factorial = 1;
				for (int i = 1; i <= n; i++) {
					Factorial = Factorial * i;
				}
				System.out.println("Factorial Number is : " + Factorial);

			} catch (Exception e) {
				System.out.println("Error ... " + e);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the Number : ");
			int input = sc.nextInt();
			factorialThread t = new factorialThread(input);
			t.start();
		} catch (Exception e) {
			System.out.println("Main Error ..." + e);
		} finally {
			sc.close();
		}
	}
}
