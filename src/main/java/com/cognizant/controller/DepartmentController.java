package com.cognizant.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employee.model.Department;
import com.cognizant.service.DepartmentService;

@RestController
public class DepartmentController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/departments")
	public ResponseEntity<List<Department>> getAllDepartments(){
		LOGGER.info("|-------------- DepartmentController Starts ------------| ");
		List<Department> departmentList = departmentService.getAllDepartments();
		LOGGER.info("|----------- DepartmentController Ends -----------------| ");
		return new ResponseEntity<List<Department>>(departmentList, HttpStatus.OK);
	}

}
