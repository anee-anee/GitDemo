import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import oracle.sql.BLOB;

//import org.graalvm.compiler.lir.amd64.vector.AMD64VectorShuffle.Insert128Op;

public class FruitDataBaseConnection {
public static void main(String[] args) {
	Connection conn = null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		Statement stmt = conn.createStatement();
		String  sql = "Insert into Fruits(fruitName, taste, color, price)" + "values('pineapple','sour','yellow',72)";
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
	


