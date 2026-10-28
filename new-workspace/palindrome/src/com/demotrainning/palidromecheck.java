package com.demotrainning;

public class palidromecheck {

	public static void main(String[] args) {
		String str = "madam";

		if (isPalindrome(str)) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}
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
 