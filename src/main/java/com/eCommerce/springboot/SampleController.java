package com.eCommerce.springboot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/welcome") 
	public Map<String, String> welcome() {
	 Map<String, String> response = new HashMap<>();
    response.put("message", "Welcome to Organic Food Restaurant!");
    return response;
	
	
	
	/*public String welcome() {
		return "Welcome to my Organic Food Shop!";*/
	}
}

/* public String saySampleHello() {
return "Hi, how are you. This is from Spring Boot";
}*/

