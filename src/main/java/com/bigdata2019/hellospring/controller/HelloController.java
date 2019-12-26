package com.bigdata2019.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(value="n", required=true, defaultValue="") String name,
			@RequestParam(value="a", required=true, defaultValue="") Integer age) {
		
		System.out.println("--"+name+"--");
		System.out.println("--"+age+"--");
		
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello/world")
	public String hello2() {
		return "/WEB-INF/views/hello2.jsp";
	}
}

