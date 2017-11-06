package tw.brad.java.example;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad65 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://tccashow.org.tw/wp-content/uploads/2017/10/%E5%AE%98%E7%B6%B2Banner-01.jpg");
			HttpURLConnection conn = 
					(HttpURLConnection)url.openConnection();
			conn.connect();
			
			FileOutputStream fout = new FileOutputStream("./upload/tcca.jpg");
			
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
