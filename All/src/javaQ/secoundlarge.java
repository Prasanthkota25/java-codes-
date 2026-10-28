package javaQ;

import java.util.Arrays;

public class secoundlarge {

	public static void main(String[] args) {
		int[] arr = { 10, 50, 40, 20, 60 };

		Arrays.sort(arr);

		int secoundlarge = arr[arr.length - 2];
		System.out.println("Secound large number : " + secoundlarge);
	}
}
