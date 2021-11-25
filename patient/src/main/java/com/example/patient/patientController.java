package com.example.patient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class patientController {
	@GetMapping("/patient")
	public String patient() {
		return "List of Patients";
	}

}
