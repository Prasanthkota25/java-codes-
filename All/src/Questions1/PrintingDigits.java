package Questions1;

import java.util.Scanner;

public class PrintingDigits {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		while (temp > 0) {
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp = temp /= 10;
		}

		System.out.println("Normal Order : ");
		while (rev > 0) {
			int digit = rev % 10;
			System.out.println(digit);
			rev = rev / 10;
		}
		System.out.println("Reversed Order : ");
		while (n > 0) {
			int digit = n % 10;
			System.out.println(digit);
			n = n / 10;
		}
	}
}
