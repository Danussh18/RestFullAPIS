package com.cognizant.employee.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.employee.model.Department;

@Component
public class DepartmentDAOImpl implements DepartmentDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentDAOImpl.class);
	
	private static List<Department> departmentList;
	
	static {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		departmentList = (List<Department>) context.getBean("departmentList", java.util.ArrayList.class);
	}
	
	@Override
	public List<Department> getAllDepartments() {
		return departmentList;
	}

}
