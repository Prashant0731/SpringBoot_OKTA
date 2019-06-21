package com.yash.controller;

import java.security.Principal;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {

	
	@GetMapping("/")
	public String getUsersEmailAddress(Principal principal) {
		return "Hello your's Email address is: "+principal.getName();
	}
	
	@RequestMapping(value="/index", method= RequestMethod.GET)
	public String indexPage() {
		return "index";
	}
	
}
