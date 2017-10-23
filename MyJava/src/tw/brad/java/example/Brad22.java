package tw.brad.java.example;

public class Brad22 {

	public static void main(String[] args) {
		String s1 = "Brad";	// no new, has object
		System.out.println(s1.charAt(1));
		System.out.println("Brad".charAt(2));
		
		Bike b1 = new Bike(); Bike b2 = new Bike();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1 == b2);
		int a1 = 10, a2 = 10;
		System.out.println(a1 == a2);
		
		String s2 = "Brad";
		System.out.println(s1 == s2);
		
		String s3 = new String("Brad");
		String s4 = new String("Brad");
		System.out.println(s3 == s4);
		
		System.out.println(b1.equals(b2));
		
		System.out.println(s3.equals(s4));
		
		
	}

}
