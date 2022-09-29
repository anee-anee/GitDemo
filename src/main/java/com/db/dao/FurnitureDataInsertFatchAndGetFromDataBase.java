package com.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

//import com.collection.bean.Fruit;
import com.mav.bean.Furniture;

public class FurnitureDataInsertFatchAndGetFromDataBase {
	public static void insertData() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system1");
			Statement stmt = conn.createStatement();
			String sql = "Insert into Furniture(name,material, price,isShipping,dateOfManufacture)"
					+ "values ('bench','wood',150,'false','23-jan-2022')";
			stmt.executeQuery(sql);
			System.out.println("Added");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
			}
		}
	}

	public HashMap<Integer, Furniture> fatchData() {
		HashMap<Integer, Furniture> hasobj = new HashMap<Integer, Furniture>();
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system1");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select name,isShipping,dateOfManufacture from Furniture ");
			while (rs.next()) {

				String name = rs.getString(1);
				boolean isShipping = rs.getBoolean(2);
				String dateOfManufacture = rs.getString(3);

				Furniture fobj = new Furniture();
				fobj.setName(name);
				fobj.setShipping(isShipping);
				fobj.setDateOfManufacture(dateOfManufacture);
				hasobj.put(1, fobj);
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
		return hasobj;

	}

	public static void getData(HashMap<Integer, Furniture> hasobj) {
		System.out.println("Data is");
		for (Map.Entry<Integer, Furniture> entry : hasobj.entrySet()) {
			int Key=entry.getKey();
			Furniture Value=entry.getValue();
			System.out.println( entry.getKey()+"   "+Value.getName() + "  " + Value.getShipping() + " " + Value.getDateOfManufacture());
		}

	}

	public static void main(String[] args) {
		FurnitureDataInsertFatchAndGetFromDataBase obj = new FurnitureDataInsertFatchAndGetFromDataBase();
            obj.insertData();
               HashMap<Integer,Furniture> hasobj = obj.fatchData();
              obj.getData(hasobj);
	}

}
