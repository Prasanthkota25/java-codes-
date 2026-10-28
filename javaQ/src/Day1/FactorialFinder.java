package Day1;

import java.util.Scanner;

public class FactorialFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num:");

//		int num = sc.nextInt();
//
//		long fact = 1;
//
//		for (int i = 1; i <= num; i++) {
//			fact = fact * i;
//		}
//		System.out.println("factorial of " + num + "is :" + fact);
//		sc.close();

		int num = sc.nextInt();

		long factorial = 1;
		int i = 1;

		while (i <= num) {
			factorial = factorial * i;
			i++;
		}
		System.out.println("Factorial of " + num + " is :" + factorial);
		sc.close();
	}
}
