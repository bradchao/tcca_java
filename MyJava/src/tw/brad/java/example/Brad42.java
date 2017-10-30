package tw.brad.java.example;

import java.io.File;

public class Brad42 {

	public static void main(String[] args) {
		File testDir = new File("d:/xyz");
		System.out.println(testDir.exists());
	}

}
