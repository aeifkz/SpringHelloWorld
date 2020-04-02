package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class UserController {
	
	@RequestMapping("/MyFirstPage")
	public String greeting(@RequestParam(value="title",required=false,defaultValue="這個只是測試")String title, Model model) {		
		model.addAttribute("name",title);
		return "index";		
	}
	

}
