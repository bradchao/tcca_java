package tw.brad.java.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad46 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = 
					new FileOutputStream("./dir1/brad2.pdf");
			FileInputStream fin = 
					new FileInputStream("./dir1/brad.pdf");
			int i;
			while ( (i = fin.read()) != -1) {
				fout.write(i);
			}
			fin.close();
			fout.flush();
			fout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println("ERR");
		}
	}

}
