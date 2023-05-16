package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ProductController {
	@Autowired
	private HttpServletRequest req;

	@GetMapping("/product/form")
	public String form() {
		return "product/form";
	}

	@PostMapping("/product/save")
	public String save(@RequestParam String name, @RequestParam double price) {
		req.setAttribute("name", name);
		req.setAttribute("price", price);
		return "product/form";
	}
}
