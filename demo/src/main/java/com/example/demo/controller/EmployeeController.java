package com.example.demo.controller;

import java.util.List;

import com.example.demo.manualException.EmployeenotFoundExcption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import  com.example.demo.Employe.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/employee")

	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@GetMapping("/employee")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();

	}

	@GetMapping("/employee/{id}")
	public Employee findEmployeeByid(@PathVariable("id") Integer eid) throws EmployeenotFoundExcption {
		return employeeService.findEmployeeBid(eid);
	}

	@DeleteMapping("/employee/{id}")
	public void deleteById(@PathVariable("id") Integer eid) {
		employeeService.deleteById(eid);
	}

	@PutMapping("/employee/{id}")
	public Employee updateById(@PathVariable("id") Integer eid, @RequestBody Employee employee) {
		return employeeService.updateById(eid, employee);
	}

	@GetMapping("/employee/name/{name}")
public  Employee getEmployeeByName(@PathVariable("name") String EmployeeName){
  return  employeeService.getEmployeeByName(EmployeeName);
}

}
