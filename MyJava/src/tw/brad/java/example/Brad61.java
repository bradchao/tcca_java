package tw.brad.java.example;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Brad61 {

	public static void main(String[] args) {
		byte[] buf = "Hello, Brad".getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(buf, buf.length, 
					InetAddress.getByName("10.10.20.30"), 8888);
			socket.send(packet);
			socket.close();
			System.out.println("OK: Send");
		} catch (Exception e) {
			System.out.println("ERR:" +e.toString());
		}
		
	}

}
