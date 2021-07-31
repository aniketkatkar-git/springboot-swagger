package com.springboot.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.swagger.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>{

}