package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.model.EducationalDetails;

public interface EducationalDetailsRepository extends JpaRepository<EducationalDetails,String> {

}
