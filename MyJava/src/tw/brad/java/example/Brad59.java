package tw.brad.java.example;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Brad59 {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.google.com.tw");
			System.out.println(ip.getHostAddress());
			
		} catch (UnknownHostException e) {
			System.out.println("UnknownHost");
		}
	}

}
