import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BookDataBaseConnection {
	public static void main(String[] args) {
	

	Connection conn = null;
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		Statement stmt = conn.createStatement();
		String sql = "Insert into Book(bookname,price,authour)" + "values('cc',43,'cccc')";
		stmt.executeQuery(sql);
		System.out.println("Data is added");
	}catch(
	Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try {
			if (conn != null) 
			{
				conn.close();
			}
		}
		catch (Exception exception) {
			
		}

	}
}
}
