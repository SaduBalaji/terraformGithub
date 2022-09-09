package com.aws.poc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/")
	public String getResponse() {
		return "welcome balu loves jam";
	}
@GetMapping("balu")
	public String get() {
		return "i love you jam , i can't explain my happiness while am typing your name...along with i love you ...";
	}
	
	@GetMapping("jam")
	public String getname() {
		return "karridhana,pandhikukka,karrilu,bangaru,nana,partner,jam,baby,jayashree,pottidhana...";
	}
}
