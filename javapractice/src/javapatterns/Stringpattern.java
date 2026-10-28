package javapatterns;

import java.util.Scanner;

public class Stringpattern {
	public static void main(String[] args) {
//		String s = "prasanth";
//
//		int n = s.length();
//		for (int i = 0; i < n + 1; i++) {
//			System.out.println(s.substring(0, i));
//		}

//		int n = 5;
//		for (int i = n; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		String s = "prasanth";
		Scanner Sc = new Scanner(System.in);

		int n = s.length();
		for (int i = n; i > 0; i--) {

			System.out.println(s.substring(0, i));
		}
		System.out.println("");
	}

}
