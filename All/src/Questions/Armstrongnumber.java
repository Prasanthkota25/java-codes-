package Questions;

import java.util.Scanner;

public class Armstrongnumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int sum = 0;
		int temp = n;

		while (temp > 0) {
			int digit = temp % 10;
			sum += (digit * digit * digit);
			temp /= 10;
		}
		if (sum == n) {
			System.out.println("it is Armstrongnumber ");
		} else {
			System.out.println("it is not a Armstrong number");
		}

	}
}
