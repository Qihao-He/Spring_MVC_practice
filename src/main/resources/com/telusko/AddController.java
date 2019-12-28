package com.telusko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
//	@RequestMapping(path = "/add", method = RequestMethod.GET)
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response, ) {
//		System.out.println("add controller working");
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		int k = i + j;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result",k);
		return mv;
	}
}
