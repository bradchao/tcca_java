package tw.brad.java.example;

import java.util.TreeSet;

public class Brad75 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		while (set.size()<6) {
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set.toString());
		System.out.println("---");
		
		TreeSet set2 = new TreeSet();
		set2.add(12);
		set2.add("13");
		System.out.println(set2.toString());
		
	}

}
