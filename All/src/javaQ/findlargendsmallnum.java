package javaQ;

public class findlargendsmallnum {
	public static void main(String[] args) {

		int[] num = { 10, 20, 3, 50, 40, 3, 25, 55, 33, 1 };

		int large = num[0];
		int small = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > large) {
				large = num[i];
			}
			if (num[i] < small) {
				small = num[i];
			}
		}
		System.out.println("large : " + large);
		System.out.println("small : " + small);
	}
}
