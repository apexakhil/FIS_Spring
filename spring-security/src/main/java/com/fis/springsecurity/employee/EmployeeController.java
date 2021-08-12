package com.fis.springsecurity.employee;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping
	public Iterable<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@PostMapping
	public String addEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "Saved";
	}

	@PutMapping
	public String updateEmployee(@RequestBody Employee employee) {
		Optional<Employee> e = employeeRepository.findById(employee.getId());
		if (e.isPresent()) {
			employeeRepository.save(employee);
			return "Updated";
		} else {
			return "Employee Not Found!!";
		}
	}

	@DeleteMapping
	public String deleteEmployee(@RequestParam int id) {
		Optional<Employee> e = employeeRepository.findById(id);
		if (e.isPresent()) {
			employeeRepository.delete(e.get());
			return "Deleted";
		} else {
			return "Employee Not Found!!";
		}
	}

	@GetMapping("/{id}")
	public Object getAemployee(@PathVariable int id) {
		Optional<Employee> e = employeeRepository.findById(id);
		if (e.isPresent()) {
			return e.get();
		} else {
			return "Employee Not Found!!";
		}
	}

}
