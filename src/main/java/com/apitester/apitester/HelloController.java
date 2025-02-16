package com.apitester.apitester;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String index() {
		return "Greetings from Kale's first Spring Boot Api that was just updated!";
	}

}
