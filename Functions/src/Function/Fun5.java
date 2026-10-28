package Function;

import java.util.Scanner;

public class Fun5 {
	static void Mysum(int a, int b) {
		System.out.println(a + b);
	}

	static int Mynum(int a1, int b2) {
		return a1 + b2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = Mynum(a, b);
		System.out.println(c);

		int a1 = sc.nextInt();
		int b2 = sc.nextInt();
		Mysum(a1, b2);

		int[] a2 = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]);
		}

		int[] a3 = { 1, 2, 3, 4, 5 };
		for (int i : a3) {
			System.out.println(i);
		}

	}
}
