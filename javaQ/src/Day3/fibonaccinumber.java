package Day3;

import java.util.Scanner;

public class fibonaccinumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		try {
			int n = sc.nextInt();
			int first = 0;
			int secound = 1;

			for (int i = 1; i <= n; i++) {
				System.out.println(first + "");
				int temp = first + secound;
				first = secound;
				secound = temp;

			}
		} catch (Exception e) {
			System.out.println("Error ...." + e);
		} finally {
			sc.close();
		}
	}
}
