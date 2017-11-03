package tw.brad.java.example;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Brad55 {

	public static void main(String[] args) {
		try {
			DataInputStream din = 
				new DataInputStream(
						new FileInputStream("./dir1/data.brad"));
			int n1 = din.readInt();
			System.out.println(n1);
			int n2 = din.readInt();
			System.out.println(n2);
			din.close();
			System.out.println("OK");
		}catch(Exception ee) {
			System.out.println(ee.toString());
		}
	}

}
