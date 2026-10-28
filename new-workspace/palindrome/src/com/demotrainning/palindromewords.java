package com.demotrainning;

public class palindromewords {

	public static void main(String[] args) {

		String str = "Mom dad  went out   with racecar ";

		str = str.toLowerCase();
		String[] words = str.split("\\s+");
		int palindromeCount = 0;

		for (String word : words) {
			if (isPalindrome(word)) {
				palindromeCount++;
			}
		}

		System.out.println("Number of palindrome words: " + palindromeCount);
	}

	public static boolean isPalindrome(String word) {
		int left = 0;
		int right = word.length() - 1;

		while (left < right) {
			if (word.charAt(left) != word.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

}
