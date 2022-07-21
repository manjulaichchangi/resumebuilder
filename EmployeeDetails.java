package com.example.model;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDetails {
	@Id
	private String empid;
	private String firstName;
	private String middleName;
	private String lastname;
	private String homeAddress;
	private Blob photo;
	private String mobilenumber;
	private String mailid;
	private String gender;
	private String maritalStatus;
	private int age;
	private String area;
	private String country;
	private String state;
	private String city;
	private int pincode;
	private String currentAddress;
	private String stayWith;
	private String summary;
	private Blob resume;
	private String reference;
	private String language;
	private String expectedSalary;
	private String currentSalary;
	@Override
	public String toString() {
		return "EmployeeDetails [empid=" + empid + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastname=" + lastname + ", homeAddress=" + homeAddress + ", photo=" + photo + ", mobilenumber="
				+ mobilenumber + ", mailid=" + mailid + ", gender=" + gender + ", maritalStatus=" + maritalStatus
				+ ", age=" + age + ", area=" + area + ", country=" + country + ", state=" + state + ", city=" + city
				+ ", pincode=" + pincode + ", currentAddress=" + currentAddress + ", stayWith=" + stayWith
				+ ", summary=" + summary + ", resume=" + resume + ", reference=" + reference + ", language=" + language
				+ ", expectedSalary=" + expectedSalary + ", currentSalary=" + currentSalary + "]";
	}
	
	

}
