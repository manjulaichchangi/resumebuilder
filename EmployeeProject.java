package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeProject {
	@Id
	private String projectid;
	private String projectDetails;
	private int experienceYears;
	private int experienceMonths;
	private String companyName;
	private String jobTitle;
	private int startDateYear;
	private int startDateMonth;
	private String empid;
	@Override
	public String toString() {
		return "EmployeeProject [projectid=" + projectid + ", projectDetails=" + projectDetails + ", experienceYears="
				+ experienceYears + ", experienceMonths=" + experienceMonths + ", companyName=" + companyName
				+ ", jobTitle=" + jobTitle + ", startDateYear=" + startDateYear + ", startDateMonth=" + startDateMonth
				+ ", empid=" + empid + "]";
	}
	
	

}
