package com.training.org;

public class Employee {
	
	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		System.out.println("Employee.Employee() is called");
	}
	
	public Employee(int empID,String empName,double salary) {
		System.out.println("Employee.Employee(-) is called");
		this.empId=empID;
		this.empName=empName;
		this.salary=salary;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String name) {
		this.empName=name;
	}
	
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
}
