package com.example.demo.service;

import com.example.demo.Employe.Employee;
import com.example.demo.rep.EmployeeRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

//    @Autowired
//    private EmployeeService employeeService;
//
//    @MockBean
//    private EmployeeRepo employeeRepo;
//    @BeforeEach
//    void setUp() {
//        Employee employee= Employee.builder()
//        .empName("Ganesh")
//                .eId(1)
//                .jobtitle("developer")
//                .salary("498483")
//
//                .build();
//        Mockito.when(employeeRepo.findByEmpNameIgnoreCase("Ganesh"))
//                .thenReturn(employee);
//
//    }

//    @Test
//    public void  whenValidEmployeeName_thenEmployeeShouldFound(){
//     String employeeName="Ganesh";
//        Employee employeeFound=employeeService.getEmployeeByName(employeeName);
//
//        assertEquals(employeeName, employeeFound.getEmpName());
//    }


}