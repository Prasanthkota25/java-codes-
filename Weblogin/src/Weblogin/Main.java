package Weblogin;

public class Main {

	public static void main(String[] args) {

		IDandPassword idandpassword = new IDandPassword();

		Loginpage loginPage = new Loginpage(idandpassword.Getlogininfo());
	}

}
