package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class EducationalDetails {
	
	@Id
	private String edid;
	private String qualification;
	private String stream;
	private int startYear;
	private int endYear;
	private String percentage;
	private String arrears;
	private String skills;
	private String empid;
	@Override
	public String toString() {
		return "EducationalDetails [edid=" + edid + ", qualification=" + qualification + ", stream=" + stream
				+ ", startYear=" + startYear + ", endYear=" + endYear + ", percentage=" + percentage + ", arrears="
				+ arrears + ", skills=" + skills + ", empid=" + empid + "]";
	}
	

}
