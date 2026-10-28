package Day3__1;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();

		int temp = n;
		int sum = 0;
		while (temp > 0) {
			int digit = temp % 10;
			sum += (digit * digit * digit);
			temp /= 10;
		}
		if (sum == n) {
			System.out.println("it is Armstrong Number ");
		} else {
			System.out.println("it is not  Armstronmg Number ");
		}
	}
}
