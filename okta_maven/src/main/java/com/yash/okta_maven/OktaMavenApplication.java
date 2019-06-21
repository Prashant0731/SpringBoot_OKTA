package com.yash.okta_maven;

import java.security.Principal;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class OktaMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(OktaMavenApplication.class, args);
	}
	
	@GetMapping("/")
	public String getUsersEmailAddress(Principal principal) {
/*	
 * 	return "Hello your Email address is: "+principal.getName();
*/	
	return "index";
	
	}
	
	@RequestMapping(value="/index", method= RequestMethod.GET)
	public String indexPage() {
		return "index";
	}
	
}