package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: WuYaoting
 * @Date: created in 2018/11/8 20:27
 * @Description:
 */
@RestController
public class HelloController {

	@RequestMapping("/login")
	public String hello() {
		return "hello world!";
	}

}
