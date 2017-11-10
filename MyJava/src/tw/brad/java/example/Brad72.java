package tw.brad.java.example;

import java.util.HashSet;

public class Brad72 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		Brad721 obj1 = new Brad721(11);
		Brad721 obj2 = new Brad721(21);
		Brad721 obj3 = new Brad721(30);
		
		System.out.println(set.add(obj1)); 
		System.out.println(set.add(obj2)); 
		System.out.println(set.add(obj3)); 
		
		String s1 = "Brad";
		String s2 = "Brad";
		String s3 = new String("Brad");
		System.out.println(set.add(s1) + "s:" + s1.hashCode());
		System.out.println(set.add(s2) + "s:" + s2.hashCode());
		System.out.println(set.add(s3) + "s:" + s3.hashCode());
		
		System.out.println(set.size());
		
		Object obj6 = new Object();
		Brad272 obj4 = new Brad272();
		Brad272 obj5 = new Brad272();
		System.out.println(obj4.hashCode());
		System.out.println(obj5.hashCode());
		System.out.println(obj6.hashCode());
		
		
		
	}

}

class Brad721{
	int a;
	Brad721(int a){this.a = a;}
	@Override
	public int hashCode() {
		System.out.println("hashCode");
		return a%2;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		return true;
	}
}

class Brad272{
	
}


