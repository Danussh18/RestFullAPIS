package com.cognizant.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employee.exception.EmployeeNotFoundException;
import com.cognizant.employee.model.Employee;
import com.cognizant.service.EmployeeService;

@RestController
public class EmployeeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		LOGGER.info(" Get All Employee Starts ");
		List<Employee> employeeList = employeeService.getAllEmployees();
		LOGGER.info(" Get All Employee Ends ");
		return new ResponseEntity<List<Employee>>(employeeList, HttpStatus.OK);
	}

	@PutMapping("/updateemployee/{empid}")
	public ResponseEntity<List<Employee>> updateEmployee(@RequestBody Employee employee, @PathVariable @Valid Integer empid)
			throws EmployeeNotFoundException {
		LOGGER.info(" Update an Employee Starts ");
		List<Employee> emp = employeeService.updateEmployee(employee, empid);
		LOGGER.info(" Update an Employee Ends ");
		return new ResponseEntity<List<Employee>>(emp, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteemployee/{empid}")
	public ResponseEntity<List<Employee>> deleteEmployee(@PathVariable @Valid Integer empid)
			throws EmployeeNotFoundException {
		LOGGER.info(" Delete an Employee Starts ");
		List<Employee> employee = employeeService.deleteEmployee(empid);
		LOGGER.info(" Delete an Employee Ends ");
		return new ResponseEntity<List<Employee>>(employee, HttpStatus.OK);
	}

}
