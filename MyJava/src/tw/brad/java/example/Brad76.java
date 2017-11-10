package tw.brad.java.example;

import java.util.LinkedList;

public class Brad76 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(0,"brad");
		list.add(0,"ok");
		list.add(0, "brad");
		list.add(0,"tcca");
		list.add(0,123);
		list.add(0,12.3);
		list.add(0,true);
		System.out.println(list.size());
		System.out.println(list.toString());
	}

}
