package com.example.demo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/ui")
public class IndexUIController {

	// returning index page
	@GetMapping(path = "/home")
	public String getHome() {
		return "index";
	}
	
}
