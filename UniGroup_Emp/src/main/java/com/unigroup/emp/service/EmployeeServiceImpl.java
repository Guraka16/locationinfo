package com.unigroup.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.unigroup.emp.model.Employee;
import com.unigroup.emp.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
		
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		
		 employeeRepository.delete(employee);;
		
	}

	@Override
	public Employee getEmployeeByid(int id) {
		return employeeRepository.findOne(id);
	}


	@Override
	public List<Employee> getAllEmployees() {
		
		return (List<Employee>) employeeRepository.findAll();
	}


}
