package tw.brad.java.example;

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
			int i; String str = "";
			while ( (i = in.read()) != -1) {
				str += (char)i;
			}
			server.close();
			System.out.println("OK:" + str);
		} catch (IOException e) {
			System.out.println("ERR:" +e.toString());
		}
	}

}
