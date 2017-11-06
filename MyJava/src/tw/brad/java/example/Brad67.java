package tw.brad.java.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

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
		
	}
	

}
