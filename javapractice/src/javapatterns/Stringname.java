package javapatterns;

import java.util.Scanner;

public class Stringname {
	public static void main(String[] args) {

		String s = "prasanth";
		Scanner Sc = new Scanner(System.in);

//		int n = s.length();
//		for (int i = n; i > 0; i--) {
//
//			System.out.println(s.substring(0, i));
//		}
//		System.out.println("");

		int n = s.length();
		for (int i = 0; i < n + 1; i++) {

			System.out.println(s.substring(0, i));

		}
		System.out.println("");
	}
}
