package com.unigroup.emp.service;

import java.util.List;
import java.util.Optional;

import com.unigroup.emp.model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	void deleteEmployee(Employee employee);
	Employee getEmployeeByid(int id);
	List<Employee> getAllEmployees();
	
}
