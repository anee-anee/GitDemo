package com.db.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.mav.bean.Mobile;
public class MobileDataInsertFetchGetFromDataBase {
public  void dataInsert() {
	Connection conn = null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system1");
		Statement stmt = conn.createStatement();
		String sql = "Insert into Mobile(name,price,brand)" + "values('iphone xr',600,'iphone')";
		stmt.executeQuery(sql);
		
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}

	finally{
		try {
			if(conn != null) {
				conn.close();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
	public HashMap<Integer,Mobile> dataFetch() {
		HashMap<Integer,Mobile> mapobj = new HashMap<Integer,Mobile>();
	
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system1");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select brand,price from Mobile");
			while (rs.next()) {
				String brand = rs.getString(1);
				Integer price = rs.getInt(2);
				Mobile obj = new Mobile();
				obj.setBrand(brand);
				obj.setPrice(price);
				mapobj.put(1,obj);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}

			finally{
				try {
					if(conn != null) {
						conn.close();
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		return mapobj;
		}
	public static void getData(HashMap<Integer,Mobile> mapobj) {
		for (Map.Entry<Integer,Mobile> entry : mapobj.entrySet()) {
			int key = entry.getKey();
			Mobile values = entry.getValue();
			System.out.println(key +"  "+values.getBrand()+"  "+values.getPrice());
		}
		
}
	public static void main(String args[]) {
		MobileDataInsertFetchGetFromDataBase mobj = new MobileDataInsertFetchGetFromDataBase();
		mobj.dataInsert();
		HashMap<Integer,Mobile> obj = mobj.dataFetch();
		
		mobj.getData(obj);
	}
}
