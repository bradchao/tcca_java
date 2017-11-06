package tw.brad.java.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad62 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			Socket socket = server.accept();
			server.close();
			System.out.println("OK");
		} catch (IOException e) {
			System.out.println("ERR:" +e.toString());
		}
	}

}
