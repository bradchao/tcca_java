package tw.brad.java.example;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Brad60 {

	public static void main(String[] args) {
		while (true) {
			byte[] buf = new byte[1024];
			try {
				DatagramSocket socket = new DatagramSocket(8888);
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				socket.close();
				
				InetAddress urip = packet.getAddress();
				byte[] data = packet.getData();
				int len = packet.getLength();
				
				String mesg = new String(data);
				
				System.out.println("OK:" + urip.getHostAddress() + ":" +  
						len + ":" + new String(buf,0,len));

				if (mesg.equals("GameOver")) {
					break;
				}
				
			}catch(Exception ee) {
				System.out.println("ERR:" + ee.toString());
			}
		}
		System.out.println("Server Down");
	}

}
