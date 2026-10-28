package Day1;

import java.util.Scanner;

public class multiplication {
	public static void main(String[] args) {
//		int n = 10;
//		for (int i = 1; i <= n; i++) {
//			System.out.println(i * 5);
//		}

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = -0; i <= 10; i++) {
			System.out.println(num + "X" + i + "=" + (num * i));
		}
	}

}
