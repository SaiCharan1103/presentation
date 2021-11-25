package com.example.diseases;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiseseaseController {
	@GetMapping("/dis")
	public String diseases() {
		return "List of Diseases";
}
}