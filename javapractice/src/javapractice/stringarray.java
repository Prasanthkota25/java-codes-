package javapractice;

public class stringarray {
	public static void main(String[] args) {

//		String[] s = new String[3];
//		s[0] = "hi";
//		s[1] = "welcome";
//		s[2] = "java";
//
//		System.out.println(s.length);
//		for (String i : s) {
//			System.out.println(i);
//		}
//
//	}

//		int a[] = new int[5];
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
//		a[4] = 50;
//
//		for (int i : a) {
//			System.out.println(i);
//		}

//		int[] a = { 10, 20, 30, 40, 50 };
//		int sum = 0;
//
//		for (int i : a) {
//			System.out.println(i);
//			sum = sum + i;
//		}
//		System.out.println(sum);
//	}

		Object a[] = new Object[6];

//		Object[] a1 = { 1, 2.0, "hello", 'h' };
//
//		for (Object i : a1) {
//			System.out.println(i);
//		}

		a[0] = 1;
		a[1] = "prasanth";
		a[2] = 'p';
		a[3] = 1.2;

		for (Object i : a) {
			System.out.println(i);
		}

	}
}
