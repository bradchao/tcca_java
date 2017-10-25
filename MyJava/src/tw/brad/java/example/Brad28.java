package tw.brad.java.example;

public class Brad28 {

	public static void main(String[] args) {
		Brad281 obj1 = new Brad281();
		obj1.m1();
		Brad282 obj2 = new Brad282();
		obj2.m1();
		obj2.m2();
	}

}
class Brad281{
	int a = 10;
	protected int m1() {
		System.out.println("Brad281:m1()");
		return 0;
	}
}
class Brad282 extends Brad281 {
	
	public int m1() {
		System.out.println("Brad282:m1()");
		return 1;
	}
	
	int m3() {
		System.out.println("Brad282:m1()");
		return 1;
	}
	
	void m2() {
		System.out.println("Brad282:m2()");
	}
	
}
