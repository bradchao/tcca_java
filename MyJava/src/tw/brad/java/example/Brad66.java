package tw.brad.java.example;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad66 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://pdfmyurl.com/?url=http://www.gamer.com.tw");
			HttpURLConnection conn = 
					(HttpURLConnection)url.openConnection();
			conn.connect();
			
			FileOutputStream fout = new FileOutputStream("./upload/gamer.pdf");
			
			BufferedInputStream in = new BufferedInputStream(conn.getInputStream());
			byte[] buf = new byte[4096]; int len = -1;
			while ( (len = in.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			fout.flush();
			fout.close();
			in.close();
			System.out.println("Download OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
