package tw.brad.java.example;

public class Brad13 {

	public static void main(String[] args) {
		int[] a1;	// good
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
		
		int[] a2 = new int[]{1,2,3,4};
		int[] a3 = {1,2,3,4};
		int[] a4;
		int[] a5;
		a4 = new int[] {1,2,3,4};
		//a5 = {1,2,3,4};
		
		
		
		
		
	}

}
