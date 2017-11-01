package tw.brad.java.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Brad49 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("./dir1/file1");
			int i;
			while ( (i = reader.read()) != -1) {
				System.out.print((char)i);
			}
			reader.close();
		} catch (Exception e) {
			
		}
		
	}

}
