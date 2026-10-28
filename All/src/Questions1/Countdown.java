package Questions1;

import java.util.Scanner;

public class Countdown {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		for (int i = n; i >= 0; i -= 5) {
			System.out.println(i);
		}
	}
}
