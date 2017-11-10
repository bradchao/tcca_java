package tw.brad.java.example;

import java.util.LinkedList;

public class Brad76 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(0,11);
		list.add(0,123);
		list.add(0, 456);
		list.add(0,111);
		list.add(0,123);
		list.add(0,123);
		list.add(0,789);
		System.out.println(list.size());
		System.out.println(list.toString());
		
		for (Integer i : list) {
			System.out.println(i);
		}
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
