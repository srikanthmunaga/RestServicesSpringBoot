package com.loginservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginService {
	
	public String resp_Message = "LoggedIn Successfully";
	
	@RequestMapping(method=RequestMethod.GET,value="/login")
	@ResponseBody
	public String login() {
		return resp_Message;
		
	}

}
