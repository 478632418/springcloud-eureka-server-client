package org.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@Value("${server.port}")
	String serverPort;

	@GetMapping("/getPortInfo")
	public String getPortInfo() {
		return "The port is "+serverPort;
	}

}
