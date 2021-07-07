package com.cognizant.employee.model;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

	@JsonProperty(value = "Employee ID")
	@NotNull
	@NumberFormat
	private Integer empId;
	
	@JsonProperty(value = "Employee Name")
	@NotNull
	@NotBlank
	@Size(min = 1, max = 30)
	private String empName;
	
	@JsonProperty(value = "Permanent")
	@NotNull
	private String permanent;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	@JsonProperty(value = "Date Of Birth")
	private Date dateOfBirth;
	
	@JsonProperty(value = "Employee Department")
	private Department department;
	
	@JsonProperty(value = "Employee Skill")
	private Skill skill;
	
	@JsonProperty(value = "Employee Salary")
	@NotNull
	@Min(value = 0)
	private Float empSalary;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPermanent() {
		return permanent;
	}

	public void setPermanent(String permanent) {
		this.permanent = permanent;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Float empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", permanent=" + permanent + ", dateOfBirth="
				+ dateOfBirth + ", empSalary=" + empSalary + "]";
	}
	
	
}
