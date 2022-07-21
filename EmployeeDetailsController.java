package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.service.EmployeeDetailsService;

@Controller
public class EmployeeDetailsController {

	@Autowired
	private EmployeeDetailsService empService;
}
