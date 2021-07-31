package com.springboot.swagger.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.swagger.model.Employee;

@Service
public interface EmployeeService {

	public List<Employee> getAllEmployee();
	public Employee getEmployeeByEmpId(String empId);
	public ResponseEntity<String> addEmployee(Employee employee);
	public ResponseEntity<String> updateEmployeeByEmpId(String empId,Employee employee);
	public ResponseEntity<String> deleteEmployeeByEmpId(String empId);
}