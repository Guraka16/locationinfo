package com.unigroup.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
	
	@RequestMapping(value="/showCreate",method=RequestMethod.GET)
	public String showCreate() {
		return "createEmployee";
		
	}

}
