package com.springboot.swagger.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.swagger.model.Employee;
import com.springboot.swagger.service.EmployeeService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/getAllEmployee")
	@ApiOperation(value = "Find all employees",
	notes = "To view all employees information",
	response = Employee.class)
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}

	@GetMapping("/getEmployeeById/{empId}")
	@ApiOperation(value = "Find employee by id",
	notes = "Provide an id to look up specific contact from the emplooye details",
	response = Employee.class)
	public Employee getEmployeeById(@PathVariable (value = "empId") String empId){
		return employeeService.getEmployeeByEmpId(empId);
	}

	@PostMapping("/addEmployee")
	@ApiOperation(value = "Find employee by id",
	notes = "Provide an id to look up specific emplooye details",
	response = Employee.class)
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee){
		return employeeService.addEmployee(employee);
	}

	@PutMapping("/updateEmployeeById/{empId}")
	@ApiOperation(value = "Update employee by id",
	notes = "Provide an id to update specific emplooye details",
	response = Employee.class)
	public ResponseEntity<String> updateEmployeeByEmpId(@PathVariable (value = "empId") String empId,@RequestBody Employee employee){
		return employeeService.updateEmployeeByEmpId(empId,employee);
	}

	@DeleteMapping("/deleteEmployeeById/{empId}")
	@ApiOperation(value = "Delete employee by id",
	notes = "Provide an id to delete specific emplooye details",
	response = Employee.class)
	public ResponseEntity<String> deleteEmployeeById(@PathVariable (value = "empId") String empId){
		return employeeService.deleteEmployeeByEmpId(empId);
	}

}