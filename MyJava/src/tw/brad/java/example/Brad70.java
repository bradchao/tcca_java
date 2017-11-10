package tw.brad.java.example;

import java.util.HashSet;

public class Brad70 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Brad");
		
		Integer i1 = new Integer(12);
		set.add(i1);
		
		Integer i2 = 12;	// auto-boxing
		Double d1 = 12.3;	// auto-boxing
		double d2 = d1;		// auto-unboxing
		
		set.add(i2);
		set.add(d1);
		set.add(d2);
		
		System.out.println(set.size());
		System.out.println(set.toString());
		
		
		
		
		
	}

}
