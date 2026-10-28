package Function;

import java.util.Scanner;

public class Fun3 {
	static void Mysum(int a, int b) {
		System.out.println(a + b);
	}

	static int Mysums(int a1, int b2) {
		return a1 + b2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		Mysum(a, b);

		int a1 = sc.nextInt();
		int b2 = sc.nextInt();
		int c = Mysums(a1, b2);
		System.out.println(a1 + b2);

	}
}
