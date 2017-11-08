package tw.brad.java.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Brad68 {

	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://localhost/tcca?user=root&password=root");
			
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://localhost/tcca", 
//					"root", "root");

			Properties prop = new Properties();
			prop.setProperty("user", "root");
			prop.setProperty("password", "root");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/tcca", prop);
			
			Statement stmt = conn.createStatement();
//			int i = stmt.executeUpdate(
//					"insert into cust (cname,tel,birthday) values " + 
//			"('brad7','123','1999-01-02'), " +
//			"('brad8','123','1999-01-02'), " +
//			"('brad9','123','1999-01-02') " 
//			);
			
//			int i = stmt.executeUpdate("delete from cust where cname='brad9'");
//			int i = stmt.executeUpdate("update cust set cname='peter',tel='321' where id=4");
			// "select account,passwd from member where account='" + account + "; delete from member; '";
			ResultSet rs = stmt.executeQuery("select id,tel,cname as custom,birthday from cust");
			
			while (rs.next()) {
				String id = rs.getString(rs.findColumn("id"));
				String cname = rs.getString(rs.findColumn("custom"));
				String tel = rs.getString(rs.findColumn("tel"));
				String birthday = rs.getString(rs.findColumn("birthday"));
				System.out.println(id +":" + cname +":" + tel + ":" + birthday);
			}

		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

}
