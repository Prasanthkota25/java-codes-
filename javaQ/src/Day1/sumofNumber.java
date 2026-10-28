package Day1;

import java.util.Scanner;

public class sumofNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");

		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("Sum of the Number " + num + " is :" + sum);
	}
}