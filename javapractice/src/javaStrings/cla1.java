package javaStrings;

public class cla1 {
//	public static void main(String[] args) {
//		String s = "java";
//		String reveresed = new StringBuilder(s).reverse().toString();
//
//		System.out.println(reveresed);
//		String s = "java";
//		String rev = " ";
//		for (int i = s.length() - 1; i >= 0; i--) {
//			rev = rev + s.charAt(i);
//		}
//		System.out.println(rev);
//
//		String s = "java";
//		char[] arr = s.toCharArray();
//		int left = 0, right = arr.length - 1;
//		while (left < right) {
//			char temp = arr[left];
//			arr[left] = arr[right];
//			arr[right] = temp;
//			left++;
//			right--;
//		}
//		System.out.println(new String(arr));
//
//		String s = "madam";
//		String rev = new StringBuilder(s).reverse().toString();
//
//		if (s.equals(rev)) {
//			System.out.println(s + " " + "is a palindromne ");
//		} else {
//			System.out.println(s + " " + "not a palindeome ");
//		}
//
//	}

//	static class emp {
//		int id;
//		String name;
//		String job;
//		int salary;
//
//		void dispaly() {
//			System.out.println(id + " " + name + " " + job + " " + salary);
//		}
//	}
//
//	public static void main(String[] args) {
//		emp myEmp = new emp();
//		myEmp.id = 1;
//		myEmp.name = "prasanth kota ";
//		myEmp.job = "dev";
//		myEmp.salary = 500000;
//		myEmp.dispaly();
//	}

//	static class emp {
//		private int empsalary;
//
//		public int getempsalary() {
//			return empsalary;
//		}
//
//		public void setempsalary(int empsalary) {
//			this.empsalary = empsalary;
//		}
//	}
//
//	public static void main(String[] args) {
//		emp myEmp = new emp();
//		myEmp.setempsalary(50000000);
//		System.out.println(myEmp.getempsalary());
//	}
//
//	public static void main(String[] args) {
//		try {
//			int a = 10;
//			int b = 0;
//			int result = a / b;
//		} catch (ArithmeticException e) {
//			System.out.println("result");
//
//		} finally {
//			System.out.println("it is working ");
//		}
//
//	}

//	public static void main(String[] args) {
//		String s = "A man, a plan, a canal: Panama";
//
//		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//
//		String reveresed = new StringBuilder(s).reverse().toString();
//
//		if (s.equals(reveresed)) {
//			System.out.println("is a palindomre");
//		} else {
//			System.out.println("not a palindrome ");
//		}
//	}

//	public static void main(String[] args) {
//		String s = "Hello java";
//
//		int vowels = 0;
//		int consonants = 0;
//		s = s.toLowerCase();
//
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if (ch >= 'a' && ch <= 'z') {
//				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//					vowels++;
//				} else {
//					consonants++;
//				}
//			}
//		}
//		System.out.println("vowels : " + vowels);
//		System.out.println("consonants : " + consonants);
//	}

//	public static void main(String[] args) {
//		String s = "prasanth";
//
//		for (int i = 0; i < s.length(); i++) {
//			boolean isuniqe = true;
//
//			for (int j = 0; j < s.length(); j++) {
//				if (i != j && s.charAt(i) == s.charAt(j)) {
//					isuniqe = false;
//					break;
//				}
//			}
//			if (isuniqe) {
//				System.out.println("first non repating character: " + s.charAt(i));
//				return;
//			}
//		}
//
//		System.out.println("no non repating character  found ");
//	}

//	public static void main(String[] args) {
//		String s = "prasanth";
//
//		int vowels = 0;
//		int consonants = 0;
//		s = s.toLowerCase();
//
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if (ch >= 'a' && ch <= 'z') {
//				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//					vowels++;
//				} else {
//					consonants++;
//				}
//			}
//  
//		}
//
//		System.out.println("vowels :" + vowels);
//		System.out.println("consonants : " + consonants);
//	}

	public static void main(String[] args) {

//		int n = 5;
//		for (int i = 0; i <= n - 1; i++) {
//			for (int j = 0; j <= 0; j++) {
//				System.out.println("*");
//			}
//		}
//		System.out.println("");
//
//	}

//		String name = "MyName";
//
//		int n = name.length();
//		for (int i = 0; i <= n - 1; i++) {
//			for (int j = 0; j <= 0; j++) {
//				System.out.println("");
//
//				// for (int m = 0; m <= i - 1; m++) {
//				System.out.print(name.substring(0, i + 1));
//				// }
//			}
//		}
//		System.out.println("");
//
//	}
//	

		String s = "prasanth";
		int n = s.length();

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j <= 0; j++) {
				System.out.println("");

				System.out.print(s.substring(0, i));

			}
		}
		System.out.println("");
	}

}
