package tw.brad.java.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad47 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileOutputStream fout = 
					new FileOutputStream("./dir1/brad3.pdf");
			FileInputStream fin = 
					new FileInputStream("./dir1/brad.pdf");
			int len; byte[] buf = new byte[4096];
			while ( (len = fin.read(buf)) != -1) {
				fout.write(buf,0,len);
			}
			fin.close();
			fout.flush();
			fout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println("ERR");
		}
		System.out.println(System.currentTimeMillis()-start);
	}

}
