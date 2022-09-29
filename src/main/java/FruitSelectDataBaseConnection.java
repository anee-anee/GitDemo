import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FruitSelectDataBaseConnection {
public static void main (String[] args ) {
	Connection conn = null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("Select fruitName,color from fruits ");
		while (rs.next()) {
			String fruitName = rs.getString(1);
			String color = rs.getString(2);
			System.out.println(fruitName +"  "+color);
		
			
		}
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try
			{
				if(conn != null)
				{
					conn.close();
			}
				
		}
			catch(Exception e) {
			
			}
	}
}
}
