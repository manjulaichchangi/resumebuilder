package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.EducationalDetailsRepository;

@Service
public class EducationalDetailsService {

	@Autowired
	private EducationalDetailsRepository edurepo;
}
