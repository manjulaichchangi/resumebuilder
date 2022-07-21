package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.service.EmployeeAccessDetailsService;

@Controller
public class EmployeeAccessDetailsController {
	@Autowired
	private EmployeeAccessDetailsService accessService;
}
