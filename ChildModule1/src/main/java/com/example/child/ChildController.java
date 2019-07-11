package com.example.child;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/child")
public class ChildController {

	@GetMapping("/message")
	public String getMessage() {
		return "This is child Module";
	}
}
