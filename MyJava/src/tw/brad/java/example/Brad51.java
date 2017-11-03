package tw.brad.java.example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Brad51 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("./dir1/file1");
			InputStreamReader ir = new InputStreamReader(fin);
			BufferedReader reader = new BufferedReader(ir);
			String line = null;
			while ( (line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			reader.close();
			
			
		} catch (Exception e) {
		}
	}

}
