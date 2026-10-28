package javapractice;

public class getmeth {
	static class employee {
		int eid;
		String ename;
		String ejob;
		int eincome;

		void printdata() {
			System.out.println(eid + " " + ename + " " + ejob);
		}
	}

	public static void main(String[] args) {
		employee emp1 = new employee();
		emp1.eid = 1;
		emp1.ename = "prasanth";
		emp1.ejob = "java dev";
		emp1.printdata();

		employee emp2 = new employee();
		emp2.eid = 2;
		emp2.ename = "siva";
		emp2.ejob = "tester";
		emp2.printdata();

	}

}
