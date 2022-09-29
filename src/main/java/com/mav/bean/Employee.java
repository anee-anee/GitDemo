package com.mav.bean;

import java.sql.Date;

public class Employee {
	

		private String employeeName;
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getJoiningdate() {
			return joiningdate;
		}
		public void setJoiningdate(String joiningdate) {
			this.joiningdate = joiningdate;
		}
		private String address;
		private int age;
		private double salary;
		private  String joiningdate;
		
		

	}


