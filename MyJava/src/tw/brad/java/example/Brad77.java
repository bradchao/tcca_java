package tw.brad.java.example;

import java.util.HashMap;
import java.util.Set;

public class Brad77 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("name", "Brad");
		map.put("weight", 82.5);
		map.put("gender", false);
		map.put("age", 52);
		
		map.put("weight", 80);
		
		Set set = map.keySet();
		for(Object key :set) {
			System.out.println(key + " => " + map.get(key));
		}
		
		
		
		
	}

}
