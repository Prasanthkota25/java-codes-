package Day3;

import java.util.Scanner;

public class Factorialnum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		try {
			int n = sc.nextInt();
			int Factorial = 1;
			for (int i = 1; i <= n; i++) {
				Factorial = Factorial * i;
			}
			System.out.println(n + " Factorial is :" + Factorial);
		} catch (Exception e) {
			System.out.println("Error ..." + e);
		}finally {
			sc.close();
		}
	}
}
