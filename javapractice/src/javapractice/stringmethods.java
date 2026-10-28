package javapractice;

public class stringmethods {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hi";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s2);
		System.out.println(s2.length());

		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));

		String s = "WELCOME";

		System.out.println(s.subSequence(0, 3));
		System.out.println(s.subSequence(2, 5));
		System.out.println(s.subSequence(4, 7));

		System.out.println(s.equalsIgnoreCase(s));
		System.out.println(s.replace('W', 'a'));

	}

}
