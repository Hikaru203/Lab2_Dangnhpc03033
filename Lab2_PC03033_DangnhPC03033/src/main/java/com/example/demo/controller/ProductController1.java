package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Product;

@Controller
public class ProductController1 {

	@GetMapping("/product/form2")
	public String form(Model model) {
		Product p = new Product();
		p.setName("iPhone 30");
		p.setPrice(5000.0);
		model.addAttribute("p1", p);
		return "product/form2";
	}

	@PostMapping("/product/save2")
	public String save(@ModelAttribute("p2") Product p, Model model) {
	    return "product/form2";
	}

	@ModelAttribute("items")
	public List<Product> getItems() {
		return Arrays.asList(new Product("A", (double) 1), new Product("B", (double) 12));
	}
}
