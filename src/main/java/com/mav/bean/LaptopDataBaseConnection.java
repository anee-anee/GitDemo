package com.mav.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class LaptopDataBaseConnection {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			Statement stmt = conn.createStatement();
			String sql = "Insert into Laptop(laptopname,price,brand)"+"values('lenovo 678',1000,'lenovo')";
			stmt.executeQuery(sql);
			System.out.println("added succsesfully");
		}
		catch(Exception e) {
			e.printStackTrace();}
		finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}
			catch(Exception e) {
				e.printStackTrace();}	
		}
			
			
			
	}

}
