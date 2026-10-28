package Day3_0;

import java.util.Scanner;

public class PrimeNumber {
	static class primeThread extends Thread {
		int n;

		primeThread(int n) {
			this.n = n;
		}

		public void run() {
			try {
				boolean isprime = true;
				if (n <= 1) {
					isprime = false;
				} else {
					for (int i = 2; i < n; i++) {
						if (n % i == 0) {
							isprime = false;
						}
					}
				}
				if (isprime) {
					System.out.println("it is prime number");
				} else {
					System.out.println("it is not a prime number ");
				}
			} catch (

			Exception e) {
				System.out.println("Error...." + e);
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the Number : ");
			int input = sc.nextInt();
			primeThread t = new primeThread(input);
			t.start();
		} catch (Exception e) {
			System.out.println("Main Error ..." + e);
		} finally {
			sc.close();
		}
	}
}
