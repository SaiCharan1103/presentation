package com.example.doctor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class docController {
	
	@GetMapping("/doctors")
	public String doctors() {
		return "List of Doctors";
	}

}