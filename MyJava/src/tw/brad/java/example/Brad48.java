package tw.brad.java.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad48 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			File file = new File("./dir1/brad.pdf");
			FileInputStream fin = new FileInputStream(file);
			byte[] buf = new byte[(int)file.length()];
			fin.read(buf);
			fin.close();
			
			FileOutputStream fout = new FileOutputStream("./dir1/brad4.pdf");
			fout.write(buf);
			fout.flush();
			fout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println("ERR");
		}
		System.out.println(System.currentTimeMillis()-start);
	}

}
