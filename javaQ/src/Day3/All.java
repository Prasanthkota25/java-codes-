package Day3;

import java.util.Scanner;

public class All {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		try {
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				System.out.println(i); 
			}
		} catch (Exception e) {
			System.out.println("Error..." + e);
		} finally {
			sc.close();
		}
	}
}
