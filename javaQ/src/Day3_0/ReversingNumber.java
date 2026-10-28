package Day3_0;

import java.util.Scanner;

public class ReversingNumber {
	static class reversThread extends Thread {
		int n;

		reversThread(int n) {
			this.n = n;

		}

		public void run() {
			try {

				int temp = n;
				int reversed = 0;
				while (temp != 0) {
					int digit = temp % 10;
					reversed = reversed * 10 + digit;
					temp /= 10;
				}
				System.out.println("Reversed Number : " + reversed);
			} catch (Exception e) {
				System.out.println("Error..." + e);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the Number :");
			int input = sc.nextInt();
			reversThread t = new reversThread(input);
			t.start();
		} catch (Exception e) {
			System.out.println("Main Error ..." + e);
		} finally {
			sc.close();
		}
	}
}
