package com.week3project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@RequestMapping("/hello")
	public String sayHi() {
		return "hello";
	}
}
