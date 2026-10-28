package Day3_0;

import java.util.Scanner;

public class Armstrongnumber {
	static class ArmstrongThread extends Thread {
		int n;

		ArmstrongThread(int n) {
			this.n = n;
		}

		public void run() {
			try {
				int sum = 0;
				int temp = n;
				while (temp > 0) {
					int digit = temp % 10;
					sum += (digit * digit * digit);
					temp /= 10;
				}
				if (sum == n) {
					System.out.println("it is Amstrong Number ");
				} else {
					System.out.println("it is not a Amstrong number ");
				}
			} catch (Exception e) {
				System.out.println("Error...." + e);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the Number : ");
			int input = sc.nextInt();
			ArmstrongThread t = new ArmstrongThread(input);
			t.start();
		} catch (Exception e) {
			System.out.println("Main Error ..." + e);
		} finally {
			sc.close();
		} 
	}
}
