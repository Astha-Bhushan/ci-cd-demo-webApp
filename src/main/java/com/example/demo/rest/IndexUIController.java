package com.example.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/ui")
public class IndexUIController {

	// returning index page
	@GetMapping(path = "/home")
	public ResponseEntity<String> getHome() {
		System.out.println("In getHome() method ..");
		return ResponseEntity.status(200).body("Hello Astha");
	}
	
}
