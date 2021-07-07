package com.cognizant.employee.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Skill {
	
	@JsonProperty(value = "Skill ID")
	@NotNull
	@NumberFormat
	private Integer skillId;
	
	@JsonProperty(value = "Skill Name")
	@NotNull
	@NotBlank
	@Size(min = 1, max = 30)
	private String skillName;

	public Integer getSkillId() {
		return skillId;
	}

	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skillName=" + skillName + "]";
	}

}
