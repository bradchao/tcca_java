import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Brad68 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/tcca?user=root&password=root");
			Statement stmt = conn.createStatement();
			int i = stmt.executeUpdate(
					"insert into cust (cname,tel,birthday) values " + 
			"('brad1','123','1999-01-02'), " +
			"('brad2','123','1999-01-02'), " +
			"('brad3','123','1999-01-02') " 
			);
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

}
