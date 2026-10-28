package Questions1;

import java.util.Scanner;

public class AverageNumber {
	public static void main(String[] args) {

		double n[] = { 10, 2.5, 20, 4.55, 33 };
		double sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum += n[i];
		}
		double average = sum / n.length;
		System.out.println("Average number : " + average);
	}
}
