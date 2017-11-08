import java.sql.Connection;
import java.sql.DriverManager;

public class Brad68 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/tcca?user=root&password=root");
			
			
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

}
