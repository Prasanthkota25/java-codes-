package Coding_Questions;

public class AverageNumber {
	public static void main(String[] args) {

		double arr[] = { 1.2, 3, 2, 4, 6.0, 20, 50, 1 };
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double average = sum / arr.length;
		System.out.println(average);

	}
}
