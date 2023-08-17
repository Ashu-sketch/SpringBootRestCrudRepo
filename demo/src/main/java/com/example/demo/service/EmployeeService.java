package com.example.demo.service;

import java.util.List;
import com.example.demo.Employe.Employee;
import com.example.demo.manualException.EmployeenotFoundExcption;


public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	Employee findEmployeeBid(Integer eId) throws EmployeenotFoundExcption;

	public void deleteById(Integer eid);

	Employee updateById(Integer eid, Employee employee);


	Employee getEmployeeByName(String employeeName);
}
