package com.fanfan.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {
	
	@RequestMapping("/")
	public String index() {
		
		return"omikuji.jsp";
	}
	
	@RequestMapping(value="/postForm", method=RequestMethod.POST)
	public String post(@RequestParam(value="num") Integer num,
						@RequestParam("city") String city,
						@RequestParam("person") String person,
						@RequestParam("hobby") String hobby,
						@RequestParam("thing") String thing,
						@RequestParam("field") String field,
						HttpSession session) {
		
		System.out.println("num "+ num + "  "+ "city " + city);
		
		session.setAttribute("num", num);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("field", field);
		
		return "redirect:/show";
	}
	
	@RequestMapping("/show")
	public String show() {
		return "show.jsp";
	}

}
