package com.bigdata2019.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board")
public class BoardController {

	@ResponseBody
	@RequestMapping("/list")
	public String list() {
		
		return "board:list";
	}
	
	@ResponseBody
	@RequestMapping("/writeform")
	public String writeform() {
		
		return "board:writeform";
	}
	
	
	@RequestMapping("/write")
	public String write() {
		System.out.println("board:write");
		return "redirect:/board/list";
	}
}
