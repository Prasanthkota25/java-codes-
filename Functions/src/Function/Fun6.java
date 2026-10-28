package Function;

import java.lang.reflect.Array;

import java.util.Scanner;

public class Fun6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Students and Subjects:");

		int students = sc.nextInt();
		int subjects = sc.nextInt();

		int[][] marks = new int[students][subjects];

		for (int i = 0; i < students; i++) {
			for (int j = 0; j < subjects; j++) {
				marks[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < students; i++) {
			for (int j = 0; j < subjects; j++) {
				System.out.print(marks[i][j] + " ");

			}
			System.out.println(' ');
		}
	}

}