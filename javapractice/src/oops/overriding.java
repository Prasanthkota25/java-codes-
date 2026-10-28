package oops;

public class overriding {

	static class payments {

		void sound() {
			System.out.println("your payment done ");
		}

		static class upi extends payments {
			@Override
			void sound() {
				System.out.println("payment done by upi ");
			}
		}

		static class creditcard extends payments {
			@Override
			void sound() {
				System.out.println("payments done by credit card ");
			}
		}

		public static void main(String[] args) {
			payments pay = new payments();
			pay.sound();

			pay = new upi();
			pay.sound();
			pay = new creditcard();
			pay.sound();
		}
	}
}
