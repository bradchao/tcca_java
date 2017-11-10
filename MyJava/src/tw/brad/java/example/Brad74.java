package tw.brad.java.example;

import java.util.HashSet;
import java.util.Iterator;

public class Brad74 {

	public static void main(String[] args) {
		Integer i1 = 123;
		Integer i2 = 124;
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		HashSet<Integer> set = new HashSet<>();
		while (set.size()<6) {
			set.add((int)(Math.random()*49+1));
		}
		//set.add("abcd");
		
		System.out.println(set.toString());
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer ii = it.next();
			System.out.println(ii);
		}
		
		System.out.println("---");
		
		// Collection
		for (Integer i :set ) {
			//Integer ii = (Integer)i;
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
	}

}
