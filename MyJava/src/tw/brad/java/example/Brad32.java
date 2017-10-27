package tw.brad.java.example;

public class Brad32 {
	public static void main(String[] args) {
		Brad321 obj1 = new Brad322();
		Brad322 obj2 = (Brad322)obj1;
		obj2.m2();
	}
}
abstract class Brad321 {
	void m1() {
		System.out.println("Brad321:m1()");
	}
}
class Brad322 extends Brad321 {
	void m2() {
		System.out.println("Brad322:m2()");
	}
}
