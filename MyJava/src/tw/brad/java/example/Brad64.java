package tw.brad.java.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad64 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.tcca.org.tw/");
			HttpURLConnection conn = 
					(HttpURLConnection)url.openConnection();
			conn.connect();
			BufferedReader reader = 
					new BufferedReader(
							new InputStreamReader(conn.getInputStream()));
			String line;
			while ( (line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			reader.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
