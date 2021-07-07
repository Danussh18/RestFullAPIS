package com.cognizant.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employee.dao.EmployeeDAO;
import com.cognizant.employee.exception.EmployeeNotFoundException;
import com.cognizant.employee.model.Employee;

@Service
public class EmployeeService {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);

	@Autowired
	EmployeeDAO empDao;

	static List<Employee> employeeList;

	public List<Employee> getAllEmployees() {
		LOGGER.info(" Get ALL Emplloyees Service Starts ");
		employeeList = empDao.getAllEmployees();
		LOGGER.info(" Get ALL Emplloyees Service Ends ");
		return employeeList;
	}

	public List<Employee> updateEmployee(Employee employee, Integer empid) throws EmployeeNotFoundException{
		LOGGER.info(" Update Employee Service Starts ");
		employeeList = empDao.updateEmployee(employee, empid);
		LOGGER.info(" Update Employee Service Ends ");
		return employeeList;
	}

	public List<Employee> deleteEmployee(Integer empid) throws EmployeeNotFoundException {
		LOGGER.info(" Update Employee Service Starts ");
		employeeList = empDao.deleteEmployee(empid);
		LOGGER.info(" Update Employee Service Ends ");
		return employeeList;
	}

}
