package javaQ;

import java.util.Arrays;

public class allljavaq {

//	static class count {
//		public static void main(String[] args) {
//			String s = "prasanth";
//
//			int vowels = 0;
//			int consonents = 0;
//			s = s.toLowerCase();
//			for (int i = 0; i < s.length(); i++) {
//				char ch = s.charAt(i);
//				if (ch >= 'a' && ch <= 'z') {
//					if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//						vowels++;
//					} else {
//						consonents++;
//					}
//				}
//
//			}
//			System.out.println("vowels : " + vowels);
//			System.out.println("consonents : " + consonents);
//		}
//	}

//	static class Stringrev {
//		public static void main(String[] args) {
////			String s = "java";
////			String rev = " ";
////
////			for (int i = s.length() - 1; i >= 0; i--) {
////				rev = rev + s.charAt(i);
////
////			}
////			System.out.println(rev);
//
////			String s = "java";
////
////			String rev = new StringBuilder(s).reverse().toString();
////			System.out.println(rev);
//		}
//	}

//	static class palindrime {
//		public static void main(String[] args) {
//			String s = "madam";
//			String rev = "";
//
//			for (int i = s.length() - 1; i >= 0; i--) {
//				rev = rev + s.charAt(i);
//			}
//			if (s.equalsIgnoreCase(rev)) {
//				System.out.println("it is palindrome ");
//			} else {
//				System.out.println("it is not a palindrome ");
//			}
//		}
//	}

//	static class febi {
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter your number :");
//			int num = sc.nextInt();
//			int first = 0;
//			int secound = 1;
//
//			for (int i = 0; i <= num; i++) {
//				System.out.println(first + " ");
//				int temp = first + secound;
//				first = secound;
//				secound = temp;
//			}
//		}
//	}

//	static class sort {
//		public static void main(String[] args) {
////			int[] arr = { 1, 3, 5, 7, 8, 6, 2, 4 };
////			Arrays.sort(arr);
////			System.out.println(Arrays.toString(arr));
//
//			int[] arr = { 1, 5, 3, 2, 4 };
//			int n = arr.length;
//
//			for (int i = 0; i < n - 1; i++) {
//				for (int j = 0; j < n - i - 1; j++) {
//					if (arr[j] > arr[j + 1]) {
//						int temp = arr[j];
//						arr[j] = arr[j + 1];
//						arr[j + 1] = temp;
//					}
//				}
//			}
//			System.out.println(Arrays.toString(arr));
//
//		}
//	}

//	static class largeNdsmall {
//		public static void main(String[] args) {
//			int[] arr = { 10, 100, 50, 2, 35, 75, 6 };
//
//			int large = arr[0];
//			int small = arr[0];
//			for (int i = 1; i < arr.length; i++) {
//				if (arr[i] > large) {
//					large = arr[i];
//				}
//				if (arr[i] < small) {
//					small = arr[i];
//				}
//			}
//			System.out.println("large number :" + large);
//			System.out.println("small number : " + small);
//
//		}
//	}

//	static class secondlarge {
//		public static void main(String[] args) {
//
//			int[] arr = { 10, 25, 7, 89, 45 };
//
//			Arrays.sort(arr);
//
//			int secoundlarge = arr[arr.length - 2];
//			System.out.println("Secound large number : " + secoundlarge);
//		}
//	}

	static class duplicates {
		public static void main(String[] args) {
			int[] arr = { 10, 20, 30, 30, 40, 50, 40, 60 };
			System.out.println("your duplicates elements are : ");

			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						System.out.println(arr[i]);
						break;
					}
				}
			}
		}
	}
}
