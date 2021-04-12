package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NITController {
	@GetMapping("/home")
	public String showHomePage() {
		return "homeDef";
	}
	@GetMapping("/feculty")
	public String showFecultyPage() {
		return "fecultyDef";
	}
	@GetMapping("/course")
	public String showCoursePage() {
		return "courseDef";
	}
	@GetMapping("/address")
	public String showAddressPage() {
		return "addressDef";
	}
}
