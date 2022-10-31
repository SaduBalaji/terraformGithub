package com.aws.poc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/")
	public String getResponse() {
		return "welcome ";
	}
@GetMapping("balu")
	public String get() {
		return "i love you , i can't explain my happiness while am typing your name...along with i love you ...";
	}
	
	@GetMapping("balaji")
	public String getname() {
		return "gangaaa";
	}
}
