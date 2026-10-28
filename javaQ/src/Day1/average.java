package Day1;

public class average {
	public static void main(String[] args) {

		double[] prices = { 10.5, 20.0, 30.75, 40.25, 50.0 };

		double sum = 0;

		for (int i = 0; i < prices.length; i++) {
			sum += prices[i];
		}
		double average = sum / prices.length;
		System.out.println("Average :" + average);
	}
}
