package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

	//Simple Method
	//URI - helloWorld
	//GET
	//@RequestMapping(method = RequestMethod.GET,path = "/helloWorld")
	@GetMapping("helloworld1")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("Bean")
	public UserDetails helloworldBean() {
	 return new UserDetails("Mohit","Sehgal","Meerut");
	}
}
