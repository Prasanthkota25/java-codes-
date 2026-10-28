package javaQ;

import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");

		int first = 0;
		int secound = 1;
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println(first + " ");
     
			int temp = first + secound;
			first = secound;
			secound = temp;
		}
	}
}
