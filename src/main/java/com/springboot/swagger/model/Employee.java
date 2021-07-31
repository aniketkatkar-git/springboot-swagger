package com.springboot.swagger.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	@ApiModelProperty(notes = "The unique id of employee")
	private String empId;

	@Column
	@ApiModelProperty(notes = "The employee name")
	private String name;

	@Column
	@ApiModelProperty(notes = "The employee mobile")
	private String mobile;

	@Column
	@ApiModelProperty(notes = "The employee emailId")
	private String emailId;

	@Column
	@ApiModelProperty(notes = "The employee designation")
	private String designation;

	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", mobile=" + mobile + ", emailId=" + emailId
				+ ", designation=" + designation + "]";
	}

}