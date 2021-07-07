package com.cognizant.employee.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonProperty;



public class Department {

	@JsonProperty(value = "Department Id")
	@NotNull
	@NumberFormat
	private Integer deptId;

	@JsonProperty(value = "Department Name")
	@NotNull
	@NotBlank
	@Size(min = 1, max = 30)
	private String deptName;

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	

}
