

// The BankAccount System........

public class bankAccountsystem {

private String  accountnumber ;
private double  balance ;

public bankAccountsystem (String accountnumber , double balance){
	this.accountnumber = accountnumber;

if(balance > 0 ){
this.balance = balance;
}
else {
this.balance =0;
			System.out.println("Balance cannot be negative. Set to 0.");

}
}


public  String  getAccountnumber(){
return accountnumber;
}
public double getBalance(){
return balance;
}


public void deposit(double amount) {

if( amount >0){
balance += amount;
}else{
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


public static void main (String [] args ) {
 bankAccountsystem myacc =new bankAccountsystem("252521" , 12345);
 myacc.deposit(500);
 myacc.withdraw(2000);
 myacc.withdraw(100);
 myacc.deposit(-200);
 
 		System.out.println("Account Number: " + myacc.getAccountnumber());
		System.out.println("Final Balance: " + myacc.getBalance());
}
}

