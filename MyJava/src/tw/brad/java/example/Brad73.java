package tw.brad.java.example;

import java.util.HashSet;

public class Brad73 {

	public static void main(String[] args) {
		Integer i1 = 123;
		Integer i2 = 124;
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		HashSet set = new HashSet();
		while (set.size()<6) {
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set.toString());
		
		
		
	}

}
