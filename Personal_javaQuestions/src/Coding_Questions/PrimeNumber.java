package Coding_Questions;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();

		boolean isprime = true;
		if (n < 1) {
			isprime = false;

		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isprime = false;
				}
			}
		}
		if (isprime) {
			System.out.println(" it is prime Number ");
		} else {
			System.out.println(" it is Not Prime Number ");
		}
	}
}
