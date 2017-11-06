package tw.brad.java.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad63 {

	public static void main(String[] args) {
		try {
			File file = new File("./dir1/coffee.jpg");
			byte[] buf = new byte[(int)(file.length())];
			FileInputStream fin = new FileInputStream(file);
			fin.read(buf);
			fin.close();
			
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
			OutputStream out = socket.getOutputStream();
			out.write(buf);
			out.flush();
			out.close();
		} catch (IOException e) {
		}
	}

}
