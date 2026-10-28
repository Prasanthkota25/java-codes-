package Function;

import java.util.Scanner;

public class Fun4 {

	public static void main(String[] args) {

		int[] a = { 2, 5, 4, 7, 4, 9 };
		a[1] = 45;

		for (int i : a) {
			System.out.println(i);
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
