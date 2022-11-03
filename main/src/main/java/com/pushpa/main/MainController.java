package com.pushpa.main;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Pushpa!";
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public String getUser(@PathVariable("id") String id) {
		return "Hello, " + id;
	}

	@PostMapping(value = "/users")
	public String createUser(String user) {
		return "Create " + user;
	}
}