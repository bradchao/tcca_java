package tw.brad.java.example;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad63 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
			OutputStream out = socket.getOutputStream();
			out.write("Hello, TCP".getBytes());
			out.flush();
			out.close();
		} catch (IOException e) {
		}
	}

}
