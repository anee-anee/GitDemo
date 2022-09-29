package com.mav.bean;

public class Employe {
	private String EmployeName;
	public String getEmployeName() {
		return EmployeName;
	}
	public void setEmployeName(String employeName) {
		EmployeName = employeName;
	}
	public String getEmployeID() {
		return EmployeID;
	}
	public void setEmployeID(String employeID) {
		EmployeID = employeID;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getCalculatingAge() {
		return calculatingAge;
	}
	public void setCalculatingAge(int calculatingAge) {
		this.calculatingAge = calculatingAge;
	}
	private String EmployeID;
	private  int Salary;
	private int calculatingAge;
}