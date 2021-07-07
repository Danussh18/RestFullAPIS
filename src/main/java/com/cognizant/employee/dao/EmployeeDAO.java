package com.cognizant.employee.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cognizant.employee.exception.EmployeeNotFoundException;
import com.cognizant.employee.model.Employee;

@Component
public interface EmployeeDAO {
	
	public List<Employee> getAllEmployees();
	
	public List<Employee> updateEmployee(Employee employee, Integer empid)throws EmployeeNotFoundException ;
	
	public List<Employee> deleteEmployee(Integer empid) throws EmployeeNotFoundException ;
	

}
