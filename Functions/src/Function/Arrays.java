package Function;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		int a1[] = { 1, 2, 3, 4, 5 };
		for (int i : a1) {
			System.out.println(i);
		}

		int[][] arr = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 3, 4, 7, 8 } };

		for (int[] i : arr) {
			System.out.println(java.util.Arrays.toString(i));
		}

	}
}
