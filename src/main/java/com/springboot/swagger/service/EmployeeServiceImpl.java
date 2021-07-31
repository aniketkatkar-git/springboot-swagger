package com.springboot.swagger.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.swagger.model.Employee;
import com.springboot.swagger.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeByEmpId(String empId) {
		return employeeRepository.getById(empId);
	}

	@Override
	public ResponseEntity<String> addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return new ResponseEntity<>("Employee details added successfully.",HttpStatus.OK);
	}

	@Override
	public ResponseEntity<String> updateEmployeeByEmpId(String empId,Employee employee) {

		Employee updateEmployee = employeeRepository.findById(empId).get();

		updateEmployee.setName(employee.getName());
		updateEmployee.setMobile(employee.getMobile());
		updateEmployee.setEmailId(employee.getEmailId());
		updateEmployee.setDesignation(employee.getDesignation());

		employeeRepository.save(updateEmployee);

		return new ResponseEntity<>("Employee details update successfully.",HttpStatus.OK);
	}

	@Override
	public ResponseEntity<String> deleteEmployeeByEmpId(String empId) {
		employeeRepository.deleteById(empId);
		return new ResponseEntity<>("Employee details deleted successfully.",HttpStatus.OK);
	}
}