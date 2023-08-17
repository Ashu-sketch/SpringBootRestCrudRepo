package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.example.demo.manualException.EmployeenotFoundExcption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Employe.Employee;
import com.example.demo.rep.EmployeeRepo;


@Service
public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired
	EmployeeRepo employeeRepo;
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}
	@Override
	public List<Employee> getAllEmployees() {
		
		
		return employeeRepo.findAll();
		
	}

	@Override
	public Employee findEmployeeBid(Integer eid) throws EmployeenotFoundExcption {
//		return employeeRepo.findById(eid).get();
		Optional<Employee> employee=employeeRepo.findById(eid);
		if (!employee.isPresent()){
			throw  new EmployeenotFoundExcption("Employee not found ");
		}
		 return  employee.get();
	}

	@Override
	public void deleteById(Integer eid) {
		 employeeRepo.deleteById(eid);
	}

	@Override
	public Employee updateById(Integer eid, Employee employee) {
		Employee db=employeeRepo.findById(eid).get();
		if (Objects.nonNull(employee.getEmpName())&&
		!"".equalsIgnoreCase(employee.getEmpName())){
			db.setEmpName(employee.getEmpName());
		}
		if (Objects.nonNull(employee.getJobtitle())&&
				!"".equalsIgnoreCase(employee.getJobtitle())){
			db.setJobtitle(employee.getJobtitle());
		}
		if (Objects.nonNull(employee.getSalary())&&
				!"".equalsIgnoreCase(employee.getSalary())){
			db.setSalary(employee.getSalary());
		}
		return  employeeRepo.save(db);
	}

	@Override
	public Employee getEmployeeByName(String employeeName) {
		return employeeRepo.findByEmpNameIgnoreCase(employeeName);
	}


}
