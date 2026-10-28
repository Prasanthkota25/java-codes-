package sample;

import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		if (i % 2 == 0) {
			System.out.println(i + " Even ");
		} else {
			System.out.println(i + " odd ");
		}
	}
}
