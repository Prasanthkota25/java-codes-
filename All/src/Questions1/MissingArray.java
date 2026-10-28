package Questions1;

public class MissingArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 7 };
		int n = 7;
		int sum = n * (n + 1) / 2;

		for (int num : arr) {
			sum -= num;
		}
		System.out.println(sum);
	}
}
