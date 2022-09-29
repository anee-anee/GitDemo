import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//import java.sql.SQLException;


public class VegetableDataBaseConnection {
	public static void main(String[] args) {
		Connection conn = null;
		
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			Statement stmt = conn.createStatement();
			String sql = "Insert into Vegetable(vegName,vegprice,vegcolor )" + "values('tomato',29,'red')";
			stmt.executeQuery(sql);
			System.out.println("added successfully");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}

		}
	}
}
