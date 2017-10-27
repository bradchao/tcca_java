package tw.brad.java.example;

public class Brad31 {
	public static void main(String[] args) {
		Brad311 obj1 = new Brad312();
		Brad311 obj2 = new Brad313();
		// obj1 is-a Brad311
		//obj2.m1();
		go(obj1);
	}
	
	static void go(Brad311 b3) {
		b3.m1();
		b3.m2();
	}
	
}
abstract class Brad311 {
	int a;
	void m1() {
		System.out.println("Brad311:m1()");
	}
	abstract void m2();
}
class Brad312 extends Brad311 {
	void m2() {
		System.out.println("Brad312:m2()");
	}
}
class Brad313 extends Brad311 {
	void m2() {
		System.out.println("Brad313:m2()");
	}
}
