package tw.brad.java.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import java.sql.PreparedStatement;

public class Brad69 {

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			prop.setProperty("user", "root");
			prop.setProperty("password", "root");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/tcca", prop);

			PreparedStatement pstmt = 
					conn.prepareStatement(
							"insert into cust (cname,tel,birthday) values" + 
							"(?,?,?)");
			pstmt.setString(1, "kevin");
			pstmt.setString(2, "1234567");
			pstmt.setString(3, "1988-02-09");
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

}
