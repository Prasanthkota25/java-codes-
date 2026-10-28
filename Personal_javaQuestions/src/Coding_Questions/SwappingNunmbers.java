package Coding_Questions;

import java.util.Scanner;

public class SwappingNunmbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value A  :");
		int a = sc.nextInt();
		System.out.println("Enter the Value B  :");
		int b = sc.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(" A Value : " + a);
		System.out.println(" B Value : " + b);
	}
}
