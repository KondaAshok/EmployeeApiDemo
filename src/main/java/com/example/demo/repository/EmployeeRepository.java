
// This Repository communicate with the Database

package com.example.demo.repository;
import com.example.demo.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

													//Entity(Model) //(String)id data type in Model
public interface EmployeeRepository extends JpaRepository<Employee, String> {
	
}
