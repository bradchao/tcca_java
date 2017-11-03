package tw.brad.java.example;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Brad54 {

	public static void main(String[] args) {
		try {
			DataOutputStream dout = 
					new DataOutputStream(new FileOutputStream("./dir1/data.brad"));
			dout.writeInt(123);
			dout.writeInt(456);
			dout.writeDouble(12.3);
			dout.writeBoolean(false);
			dout.writeChars("Hello, Brad");
			dout.flush();
			dout.close();
			System.out.println("Save OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
