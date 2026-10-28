package javaStrings;

public class Strings {
	static class emp {
		int id;
		String name;
		String job;
		int income;

		void dispaly() {
			System.out.println(id + " " + name + " " + job + " " + income);
		}
	}

	public static void main(String[] args) {
 
		emp myemp = new emp();
		myemp.id = 1;
		myemp.name = "kota prasanth";
		myemp.job = "dev";
		myemp.income = 500000;
		myemp.dispaly();

	}

}
