package tw.brad.java.example;

import java.io.File;

public class Brad43 {

	public static void main(String[] args) {
		File[] roots = File.listRoots();
		for (File root :roots) {
			System.out.println(root.getAbsolutePath());
		}
		
		File root1 = new File("C:\\UseRs\\User\\git\\MyJava\\MYJAVA");
		File root2 = new File(".");
		File root3 = new File(".");
		File root4 = new File("C:\\Users\\User\\git\\MyJava\\MyJava");
		System.out.println(root1.getAbsolutePath());
		System.out.println(root2.getAbsolutePath());
		
		File newfile = new File(root2, "dir1");
		if (newfile.exists()) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
			newfile.mkdir();
		}
		
		System.out.println("---");
		System.out.println(root1.equals(root4));
		
		
		
		
		
		
		
		
	}

}
