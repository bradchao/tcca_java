package tw.brad.java.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Brad50 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = 
					new FileOutputStream("./dir1/file1", true);
			fout.write("1234567\r\n".getBytes());
			fout.flush();
			fout.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
