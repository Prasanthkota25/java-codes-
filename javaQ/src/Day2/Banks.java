package Day2;

public class Banks {
	void payment() {
		System.out.println("Your payment is Done Through Online ...");
	}

	static class Sbi extends Banks {
		void Onlinepayment() {
			System.out.println("Your payment is Done by UPI");
		}
	}

	public static void main(String[] args) {
		Sbi mypayment = new Sbi();
		mypayment.payment();
		mypayment.Onlinepayment();

	}
}
