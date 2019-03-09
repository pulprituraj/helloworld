package com.pulp.mypackage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("/hello")
	public String Home() {
		return "Hello Word";
	}
	
	@RequestMapping("/savecountry")
	public String saveCountry() {
			return "aaa";
	}

	@RequestMapping(value = "/about", method = RequestMethod.POST)
	public String About() {
		return "About Us";
	}

	@RequestMapping(value = "/contactlist", method = RequestMethod.POST)
	public List Contact() {
		ArrayList al = new ArrayList<>();
		al.add("aaaa");
		al.add("bbbb");
		return al;
	}

}
