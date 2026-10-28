package javaStrings;

public class class1 {
//	public static void main(String[] args) {
//		String s = "java";
//		String reversed = new StringBuilder(s).reverse().toString();
//		System.out.println(reversed);

//		String s = "java";
//		String rev = " ";
//		for (int i = s.length() - 1; i >= 0; i--) {
//			rev = rev + s.charAt(i);
//		}
//		System.out.println(rev);  

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
//		try {
//			int a =10;
//			int b =0;
//			int result = a/b;
//			System.out.println(result);
//		}

//		try {
//			int a =10;
//			int b =0;
//			int result = a/b;
//			System.out.println(result);
//		}
//		catch (ArithmeticException e) {
//			System.out.println("error occured ");
//			
//		}

//		try {
//			int a = 10;
//			int b = 0;
//			int result = a / b;
//			System.out.println(result);
//		} catch (ArithmeticException e) {
//			System.out.println("error occured ");
//		} finally {
//			System.out.println("this code runs ");
//		}

//		int a = 10;
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(i);
//		}
//	}

//	static class emp {
//		private int empincome;
//
//		public int getempincome() {
//			return empincome;
//		}
//
//		public void setempincome(int empincome) {
//			this.empincome = empincome;
//		}
//	}
//
//	public static void main(String[] args) {
//		emp myemp = new emp();
//		myemp.setempincome(6000000);
//		System.out.println(myemp.getempincome());
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
//		emp myemp = new emp();
//		myemp.id = 1;
//		myemp.name = "prasanth";
//		myemp.job = "dev";
//		myemp.salary = 50000000;
//		myemp.dispaly();
//	}

	public static void main(String[] args) {
//		String s = "madam";
//		String reversed = new StringBuilder(s).reverse().toString();
//
//		if (s.equals(reversed)) {
//			System.out.println("it is palindrme ");
//		} else {
//			System.out.println("it is not a palindrome ");
//		}

//		String s = "madam";
//		boolean ispalindrome = true;
//		for (int i = 0; i < s.length() / 2; i++) {
//			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
//				ispalindrome = false;
//				break;
//			}
//
//			if (ispalindrome) {
//				System.out.println("is a palindrome");
//			} else {
//				System.out.println("is not a palindrome");
//			}
//		}

		String s = "madam";
		String reversed = new StringBuilder(s).reverse().toString();

		if (s.equalsIgnoreCase(reversed)) {
			System.out.println("is a palindrome ");
		} else {
			System.out.println("is not a palindrome ");
		}

	}

}
