package cn.tedu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController2 {
	@GetMapping("/hello1/{name}")
	public String hello1(@PathVariable String name) {
		return "2:"+name;
	}
}
