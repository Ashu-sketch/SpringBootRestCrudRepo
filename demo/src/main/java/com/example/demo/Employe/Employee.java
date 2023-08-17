package com.example.demo.Employe;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eId;
	private String empName;
	private String jobtitle;
	private String salary;
	
//	public Employee() {
//		
//	}
//	public Employee(Integer eId, String empName, String jobtitle, String salary) {
//		super();
//		this.eId = eId;
//		this.empName = empName;
//		this.jobtitle = jobtitle;
//		this.salary = salary;
//	}
//	
//	public Integer geteId() {
//		return eId;
//	}
//	public void seteId(Integer eId) {
//		this.eId = eId;
//	}
//	public String getEmpName() {
//		return empName;
//	}
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//	public String getJobtitle() {
//		return jobtitle;
//	}
//	public void setJobtitle(String jobtitle) {
//		this.jobtitle = jobtitle;
//	}
//	public String getSalary() {
//		return salary;
//	}
//	public void setSalary(String salary) {
//		this.salary = salary;
//	}
	
}
