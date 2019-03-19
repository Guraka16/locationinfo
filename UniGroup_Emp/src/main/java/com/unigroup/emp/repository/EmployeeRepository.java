package com.unigroup.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unigroup.emp.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{


	

}
