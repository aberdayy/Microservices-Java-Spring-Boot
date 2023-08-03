package com.ataberkerday.helloWordService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldRestController {

	@GetMapping(value="/hello2")
	public String sayHello() {
		return "MikroServis Mimarisi ile gonderdigim ilk mesaj";
	}
}
