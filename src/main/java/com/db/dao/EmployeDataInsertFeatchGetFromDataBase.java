package com.db.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mav.bean.Employee;

public class EmployeDataInsertFeatchGetFromDataBase {
	 

	public void dataInsert() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system1");
			Statement stmt = conn.createStatement();
			String sql = "Insert into Employe(employeeName,address,age,salary,joiningdate)"
					+ "values('Abhi','coppell',12,5000.50,'03-May-2012')";
			stmt.executeQuery(sql);
			System.out.println("Data is added");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception exception) {

			}

		} 
	}

	public List<Employee> dataFatch() {
		List<Employee> listobj = new ArrayList<Employee>();
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system1");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select employeeName,address,joiningdate from Employe ");
			while (rs.next()) {
				
				String employeeName = rs.getString(1);
				String address = rs.getString(2);
				String joiningdate = rs.getString(3);
				//System.out.println(employeeName + "  " + address + "  " + joiningdate);
				
				Employee empObj = new Employee();
				empObj.setEmployeeName(employeeName);
				empObj.setAddress(address);
				empObj.setJoiningdate(joiningdate);
				listobj.add(empObj);
				
				

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception exception) {

			}

		}
		return listobj;

	}

	public static void getData(List<Employee> listobj) {

		System.out.println("Data is");
		for (Employee eobj : listobj) {
			System.out.println(eobj.getEmployeeName() + "  " + eobj.getAddress() + " " + eobj.getJoiningdate());
		}
	}

	public static void main(String[] args) {
		EmployeDataInsertFeatchGetFromDataBase obj = new EmployeDataInsertFeatchGetFromDataBase();
		obj.dataInsert();
		List<Employee> listObj = obj.dataFatch();		 
		obj.getData(listObj);

	}
}
