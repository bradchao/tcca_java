package tw.brad.java.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Brad44 {

	public static void main(String[] args) {
		try {
			File file = new File("./dir1/file1");
			FileOutputStream fout = new FileOutputStream(file);
			String data = "Hello, World\r\n1234567\r\n7654321\r\n";
			fout.write(data.getBytes());
			String data2 = "abcdefg\r\n";
			fout.write(data2.getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		}catch(FileNotFoundException fe) {
			System.out.println("not found");
		}catch(IOException fe) {
			System.out.println("i/o eception");
		}
		
	}

}
