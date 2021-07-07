package com.cognizant.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employee.dao.DepartmentDAO;
import com.cognizant.employee.dao.DepartmentDAOImpl;
import com.cognizant.employee.model.Department;

@Service
public class DepartmentService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);
	
	@Autowired
    DepartmentDAO depDao;
	static List<Department> departmentList;

	public List<Department> getAllDepartments() {
		LOGGER.info(" DepartmentService Starts ");
		departmentList = depDao.getAllDepartments();
		LOGGER.info(" DepartmentService Ends ");
		return departmentList;
	}

}
