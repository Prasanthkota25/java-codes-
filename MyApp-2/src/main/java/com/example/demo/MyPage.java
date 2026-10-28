package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.services.UserService;

@Controller
public class MyPage {

    private final MyApp2Application myApp2Application;

	@Autowired
	UserService userService;

    MyPage(MyApp2Application myApp2Application) {
        this.myApp2Application = myApp2Application;
    }
	
	@GetMapping("/Loginpage")
	public String MyPage() {
		return "Loginpage.html";
	}
	
	@GetMapping("/registration")
	public String reg(Model model) {
		Users user = new Users();
		//user.setFirstName("Johnny");
		model.addAttribute("userObj",user);
		
		return "registration";
	}

	@PostMapping("/registration")
	public String regPost(@ModelAttribute(name = "userObj")Users userObj,Model model ) {
		
		System.out.println("User Obj ::" + userObj.toString());
		
		//Go to service layer
		String msg="";
		try {
		Users user = userService.saveUserObj(userObj);
		msg = "User saved Successfully!!";
		userObj = new Users();

		}
		catch (Exception e) {
			e.printStackTrace();
			msg = "Failed to save User, Please contact Admin";
			
		}
		model.addAttribute("msg",msg);
		model.addAttribute("userObj",userObj);
		
		
		return "registration";
	}
	
	@PostMapping("/Loginpage")
	public String checkLogin(@RequestParam("userName") String userName,
			@RequestParam("password") String password,Model model) {
		
		//System.out.println("USername:: "+userName+", Password:: "+password);
		
		//check Username password
		Users user = userService.checkPassword(userName,password);
		
		if(user!=null) {
			model.addAttribute("user",user);
			return "welcome";
		}
		else {
			return "Loginpage";
		}
	}
}
