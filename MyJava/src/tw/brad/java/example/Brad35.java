package tw.brad.java.example;

public class Brad35 {
	public static void main(String[] args) {
		Brad351 obj1 = new Brad351();
		Brad351 obj2 = new Brad3511();
		Brad3511 obj3 = new Brad3511();
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(obj3.a);
		
		obj1.m1();
		obj2.m1();
		obj3.m1();
		
	}
}
class Brad351 {
	int a = 10;
	void m1() {
		System.out.println("351:m1()");
		System.out.println(a);
	}
}
class Brad3511 extends Brad351 {
	int a = 100;
	void m1() {
		System.out.println("3511:m1()");
		System.out.println(a);
		System.out.println(super.a);
	}
	void m2() {
		System.out.println("3511:m2()");
	}
}

