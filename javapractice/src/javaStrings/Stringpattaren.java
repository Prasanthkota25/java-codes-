package javaStrings;

import java.util.Scanner;

public class Stringpattaren {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		var s = sc.nextLine();
//		int n = s.length();
//
//		for (int i = 0; i < n + 1; i++) {
//			for (int j = 0; j <= 0; j++) {
//				System.out.println(s.substring(0, i));
//			}
//		}
//		System.out.println("");

		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
