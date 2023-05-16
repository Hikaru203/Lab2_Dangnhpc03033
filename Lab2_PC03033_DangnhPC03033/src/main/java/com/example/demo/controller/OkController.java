package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OkController {
	@RequestMapping(value = "/ok")
	public String ok(Model model) {
		model.addAttribute("result","ok");
		return "ok";
	}
	
	@RequestMapping(value = "ctrl/ok")
	public String m1(Model model) {
		model.addAttribute("result","ok-m1");
		return "ok";
	}
	
	@RequestMapping(value = "ctrl/ok", method = RequestMethod.GET)
	public String m2(Model model) {
		model.addAttribute("result","ok-m2");
		return "ok";
	}
	
	@RequestMapping(value = "ctrl/ok", method = RequestMethod.POST, params = "x")
	public String m3(Model model) {
		model.addAttribute("result","ok-m3");
		return "ok";
	}
}
