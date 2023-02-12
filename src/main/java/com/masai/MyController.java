package com.masai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	@GetMapping({"/", "/home"})
	public String getHome() {
		return "Home screen Get Request";
	}
	
	@PostMapping("/post/data")
	public String postHome() {
		return "Post Successfull";
	}
	
}
