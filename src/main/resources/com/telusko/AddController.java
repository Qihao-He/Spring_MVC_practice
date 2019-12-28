package com.telusko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {
//	@RequestMapping(path = "/add", method = RequestMethod.GET)
	@RequestMapping("/add")
	public String add() {
//		System.out.println("add controller working");
		return "display.jsp";
	}
}
