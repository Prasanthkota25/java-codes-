package Day2;

public class BankaccountSystem {
	private String accountNumber;
	private double balance;

	public BankaccountSystem(String accountNumber, double balance) {
		this.accountNumber = accountNumber;

		if (balance >= 0) {
			this.balance = balance;
		} else {
			this.balance = 0;
			System.out.println("Balance cannot be negative. Set to 0.");
		}
	}

	public String GetaccountNumber() {
		return accountNumber;
	}

	public double Getbalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		} else if (amount > balance) {
			System.out.println("Insufficient balance.");
		} else {
			System.out.println("Withdrawal amount must be positive.");
		}
	}

	public static void main(String[] args) {

		BankaccountSystem myAccount = new BankaccountSystem("2525", 5000);
		myAccount.deposit(500);
		myAccount.withdraw(200);
		myAccount.deposit(-100);
		myAccount.withdraw(2000);
		
		System.out.println("Account Number: " + myAccount.GetaccountNumber());
		System.out.println("Final Balance: " + myAccount.Getbalance());

	}

}
