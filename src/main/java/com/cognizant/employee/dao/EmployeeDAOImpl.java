package com.cognizant.employee.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.employee.exception.EmployeeNotFoundException;
import com.cognizant.employee.model.Employee;

@SuppressWarnings("unchecked")
@Component
public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDAOImpl.class);

	static List<Employee> employeeList;
	
	static {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		employeeList = (List<Employee>) context.getBean("employeeList", java.util.ArrayList.class);
	}
	
	
	public List<Employee> getAllEmployees() {
		LOGGER.info(" EmployeeDAOImpl Starts ");
		LOGGER.info(" EmployeeDAOImpl Ends ");
		return employeeList;
	}

	@Override
	public List<Employee> updateEmployee(Employee employee, Integer empid) throws EmployeeNotFoundException {
		for (Employee emp : employeeList) {
			if (emp.getEmpId() == empid) {
				emp.setDateOfBirth(employee.getDateOfBirth());
				emp.setDepartment(employee.getDepartment());
				emp.setEmpName(employee.getEmpName());
				emp.setEmpSalary(employee.getEmpSalary());
				emp.setPermanent(employee.getPermanent());
				emp.setSkill(employee.getSkill());
				return employeeList;
			}
		}
		throw new EmployeeNotFoundException("Employee Not Found");
	}

	@Override
	public List<Employee> deleteEmployee(Integer empid) throws EmployeeNotFoundException {
		for (Employee e : employeeList) {
			if (e.getEmpId() == empid) {
				employeeList.remove(e);
				return employeeList;
			}
		}
		throw new EmployeeNotFoundException("Employee not Found");
	}
	
	

}
