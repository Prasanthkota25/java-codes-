package Day3;

import java.util.Scanner;

public class Amstrongnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		try {
			int n = sc.nextInt();
			int sum = 0;
			int temp = n;
			while (temp > 0) {
				int digit = temp % 10;
				sum += (digit * digit * digit);
				temp /= 10;
			}
			if (sum == n) {
				System.out.println("Amstrong number ");
			} else {
				System.out.println("it is not Amstrong number ");
			}
		} catch (Exception e) {
			System.out.println("Error...." + e);
		} finally {
			sc.close();
		}
	}
}
