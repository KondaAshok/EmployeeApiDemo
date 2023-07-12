package com.example.demo.controller;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
public class EmployeeApiService {
	
	EmployeeService employeeService;
	
	
	public EmployeeApiService(EmployeeService employeeService) {
		//super();
		this.employeeService = employeeService;
	}
	@GetMapping("{employeeId}")
	public Employee getEmployeeDetails(@PathVariable("employeeId") String employeeId) {
		return employeeService.getEmployee(employeeId);
	}
	@GetMapping()
	public List<Employee> getAllEmployeeDetails() {
		return employeeService.getAllEmployee();
	}
	@PostMapping
	public String createEmployeeDertails(@RequestBody Employee employee) {
		employeeService.createEmployee(employee);
		return "Employee details are created successfully";
	}
	@PutMapping
	public String createEmployeeDetails(@RequestBody Employee employee) {
		employeeService.updatedEmployee(employee);
		return "Employee details are updated successfully";
	}
	@DeleteMapping("{employeeId}")
	public String deleteEmployyDetails(@PathVariable("employeeId") String employeeId) {
		employeeService.deleteEmployee(employeeId);
		return "Deleted successfully";
	}
	
}







