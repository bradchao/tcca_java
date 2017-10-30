package tw.brad.java.example;

public class Brad38 {
	Brad381 obj1 = new Brad381();
	Brad382 obj2 = new Brad382();
	
	int a = 10;
	void m1() {
		obj1.m2(a);
	}
	
	class Brad382 {
		void m3() {
			System.out.println(a);
			m1();
		}
	}
	
	
	
	public static void main(String[] args) {
	}
}

class Brad381 {
	void m2(int b) {
		System.out.println(b);
	}
}
