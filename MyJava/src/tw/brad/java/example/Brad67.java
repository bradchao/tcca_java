package tw.brad.java.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;

public class Brad67 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx");
			HttpURLConnection conn = 
					(HttpURLConnection)url.openConnection();
			conn.connect();
			BufferedReader reader = 
					new BufferedReader(
							new InputStreamReader(conn.getInputStream()));
			String line; StringBuilder sb = new StringBuilder();
			while ( (line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			reader.close();
			
			parseData(sb.toString());
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	static void parseData(String json) {
		try {
			Properties prop = new Properties();
			prop.setProperty("user", "root");
			prop.setProperty("password", "root");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/tcca", prop);

			Statement stmt = conn.createStatement();
			stmt.executeQuery("set names utf8");
			
			PreparedStatement pstmt = 
					conn.prepareStatement(
							"insert into travel (cname,addr) values" + 
							"(?,?)");
		
			JSONArray root = new JSONArray(json);
			for (int i=0; i<root.length(); i++) {
				JSONObject data = root.getJSONObject(i);
				
				String name = data.getString("Name");
				String addr = data.getString("Address");
				
				pstmt.setString(1, name);
				pstmt.setString(2, addr);
				pstmt.addBatch();
			}
			
			int[] r = pstmt.executeBatch();
			System.out.println(r.length);
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	

}
