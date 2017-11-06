package tw.brad.java.example;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Brad63 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
		} catch (IOException e) {
		}
	}

}
