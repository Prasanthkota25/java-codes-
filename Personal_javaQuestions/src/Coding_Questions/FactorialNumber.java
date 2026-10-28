package Coding_Questions;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial Number is : " + factorial);
	}
}
