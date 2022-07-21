package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.EmployeeProject;
import com.example.service.EmployeeProjectService;

@RestController
public class EmployeeProjectController {

	 @Autowired
	 private EmployeeProjectService proService;
	 
	 @RequestMapping(value="addProject",method=RequestMethod.POST)
	 public String saveProject(@ModelAttribute("project") EmployeeProject pro)
	 {
		 proService.save(pro);
		return "added succesfully";
		 
	 }
	 
	 @RequestMapping("/")
	 public String hello()
	 {
		 return "hello";
	 }
	 
}
