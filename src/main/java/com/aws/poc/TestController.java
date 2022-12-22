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
		return "Happy new year in advance thanks for launching balu's service";
	}
	
	@GetMapping("balaji")
	public String getname() {
		return "happy new year in advance ";
	}
}
