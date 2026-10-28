package Day3_0;

import java.util.Scanner;

public class Fibonacciseries {
	static class fibonacciThread extends Thread {
		int n;

		fibonacciThread(int n) {
			this.n = n;
		}

		public void run() {
			try {
				int first = 0;
				int secound = 1;
				for (int i = 0; i < n; i++) {
					System.out.println(first + "");
					int temp = first + secound;
					first = secound;
					secound = temp;
				}
			} catch (Exception e) {
				System.out.println("Error..." + e);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the Number : ");
			int input = sc.nextInt();
			fibonacciThread t = new fibonacciThread(input);
			t.start();
		} catch (Exception e) {
			System.out.println("Main Error ....");
		} finally {
			sc.close();
		}
	}
}
