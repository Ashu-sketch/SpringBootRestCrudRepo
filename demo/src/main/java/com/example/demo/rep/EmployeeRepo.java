package com.example.demo.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  com.example.demo.Employe.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {


public  Employee  findByEmpName(String empName);
    public  Employee  findByEmpNameIgnoreCase(String empName);
}
