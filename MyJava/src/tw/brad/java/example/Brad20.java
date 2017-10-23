package tw.brad.java.example;

public class Brad20 {

	public static void main(String[] args) {
		String s1 = new String();
		
		byte[] b1 = {97,98,99,100, 101,102,103};
		String s2 = new String(b1);
		
		String s3 = new String(b1, 2, 4);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
	}

}
