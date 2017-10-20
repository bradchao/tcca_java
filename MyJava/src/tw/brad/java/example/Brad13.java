package tw.brad.java.example;

public class Brad13 {

	public static void main(String[] args) {
		int[] a1;	// good
		int a2[];
		a1 = new int[3];
		System.out.println(a1.length);
		System.out.println(a1[0]);
		System.out.println(a1[1]);
		System.out.println(a1[2]);
		System.out.println("-----");
		a1[0] = 123;
		a1[2] = 12;
		for (int i=0; i<a1.length; i++) {
			System.out.println(a1[i]);
		}
		System.out.println("-----");
		// for-each
		for (int v : a1) {
			System.out.println(v);
		}
		
		
		
	}

}
