package Day2;

public class Account {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {

		Account acc1 = new Account();
		acc1.setBalance(60000000);
		System.out.println(acc1.getBalance());

	}
}
