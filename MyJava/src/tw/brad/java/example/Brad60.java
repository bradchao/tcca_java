package tw.brad.java.example;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Brad60 {

	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		try {
			DatagramSocket socket = new DatagramSocket(8888);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			System.out.println("before");
			socket.receive(packet);
			System.out.println("after");
			socket.close();
			System.out.println("OK");
		}catch(Exception ee) {
			System.out.println("ERR:" + ee.toString());
		}
	}

}
