package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	public String createEmployee(Employee employee);
	public String updatedEmployee(Employee employee);
	public String deleteEmployee(String employeeId);
	public Employee getEmployee(String employeeId);
	public List<Employee> getAllEmployee();
}
