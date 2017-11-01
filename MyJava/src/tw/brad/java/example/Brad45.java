package tw.brad.java.example;

import java.io.*;

public class Brad45 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("./dir1/file1");
			int v1; byte[] buf = new byte[3];
			while ( (v1 = fin.read(buf)) != -1) {
				System.out.print(new String(buf));
			}
			
			fin.close();
			//System.out.println("OK");
		} catch (FileNotFoundException e) {
			System.out.println("E1:" +e.toString());
		} catch (IOException e) {
			System.out.println("E2" +e.toString());
		}
	}

}
