package com.javainuse.swaggertest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public ModelAndView firstpge() {
		return new ModelAndView ("Swagger Hello World");
	}
}
