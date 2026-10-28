package Oops;

public class Class2 {

	 static class Student {
		int id;
		String name;

		void Study() {
			System.out.println("Sutend is Sudying ....");
		}
	}

	public static void main(String[] args) {
		Student s1 = new Student();

		s1.id = 1;
		s1.name = "pk";
		s1.Study();
	}
}
