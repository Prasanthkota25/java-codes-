package Weblogin;

import java.util.HashMap;

public class IDandPassword {

	HashMap<String, String> logininfo = new HashMap<String, String>();

	IDandPassword() {
		logininfo.put("abcd", "abc12");
		logininfo.put("admin", "Java");
		logininfo.put("Prasanth", "Helloabc");
	}

	protected HashMap Getlogininfo() {
		return logininfo;
	}

}
 