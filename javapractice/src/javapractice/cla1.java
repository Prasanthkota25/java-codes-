package javapractice;

public class cla1 {
	static class emp {
		private int empincome;

		public int getEmpincome() {
			return empincome;
		}

		public void setEmpincome(int empincome) {
			this.empincome = empincome;
		}
	}

	public static void main(String[] args) {

		emp myEmp = new emp();
		myEmp.setEmpincome(50000000);
		System.out.println(myEmp.getEmpincome());

	}

}