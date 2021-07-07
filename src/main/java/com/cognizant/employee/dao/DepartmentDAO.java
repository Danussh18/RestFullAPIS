package com.cognizant.employee.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cognizant.employee.model.Department;

@Component
public interface DepartmentDAO {

	public List<Department> getAllDepartments();
}
