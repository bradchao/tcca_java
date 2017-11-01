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
		
		File dir4 = new File(newfile,
				"/dir2/dir3/dir4");
		if (dir4.exists()) {
			System.out.println("OK:dir4");
		}else {
			System.out.println("xx:dir4");
			dir4.mkdirs();
		}
		System.out.println("---");
		File file1 = new File(dir4, "file1");
		File file2 = new File(dir4, "file2");
		if (file1.renameTo(file2)) {
			System.out.println("rename ok");
		}else {
			System.out.println("rename xx");
		}
		File dir2 = new File("./dir1/dir2");
		File file3 = new File(dir2, "/dir4");
		if (dir4.renameTo(file3)) {
			System.out.println("rename2 ok");
		}else {
			System.out.println("rename2 xx");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
