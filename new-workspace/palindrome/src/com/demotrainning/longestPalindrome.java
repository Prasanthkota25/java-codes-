package com.demotrainning;

public class longestPalindrome{
	
	
	public static void main(String[] args) {
		 
		String str = "Mom dad  went out to watch malayalam movie ";
 
		str = str.toLowerCase();
 
		String[] words = str.split("\\s+");
	     String longestPalindrome = "";

	     
	     
	        for (String word : words) {
	            if (isPalindrome(word) && word.length() > longestPalindrome.length()) {
	                longestPalindrome = word;
	            }
	        }

	        if (!longestPalindrome.isEmpty()) {
	            System.out.println("Longest palindrome word: " + longestPalindrome);
	        } else {
	            System.out.println("No palindrome word found.");
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
