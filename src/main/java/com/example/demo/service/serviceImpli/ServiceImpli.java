package com.example.demo.service.serviceImpli;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpli implements EmployeeService {
	EmployeeRepository employeeRepository;
	
	public ServiceImpli(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public String createEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Created Successfully";
	}

	@Override
	public String updatedEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Updatede Successfully";
	}

	@Override
	public String deleteEmployee(String employeeId) {
		employeeRepository.deleteById(employeeId);
		return "Deleted";
	}

	@Override
	public Employee getEmployee(String employeeId) {
		
		return employeeRepository.findById(employeeId).get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}
	
}
