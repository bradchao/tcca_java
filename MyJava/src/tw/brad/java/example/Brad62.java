package tw.brad.java.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad62 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			Socket socket = server.accept();
			InputStream in = socket.getInputStream();
			
			FileOutputStream fout = new FileOutputStream("./upload/brad.jpg");

			byte[] buf = new byte[4096]; int len = -1;
			while ( (len = in.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			
			fout.flush();
			fout.close();
			
			in.close();
			
			server.close();
			System.out.println("OK:from " + socket.getInetAddress().getHostAddress());
		} catch (IOException e) {
			System.out.println("ERR:" +e.toString());
		}
	}

}
