package Oops;

public class EnClass {

	static class Account {
		private int Bal;

		public int getBal() {
			return Bal;
		}

		public void setBal(int bal) {
			Bal = bal;
		}

	}

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setBal(500);
		System.out.println(acc.getBal());
	}

}
