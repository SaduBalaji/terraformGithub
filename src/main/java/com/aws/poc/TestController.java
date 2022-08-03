package com.aws.poc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/")
	public String getResponse() {
		return "Hello world";
	}
@GetMapping("balu")
	public String get() {
		return "terraform use case with github authentication";
	} }
