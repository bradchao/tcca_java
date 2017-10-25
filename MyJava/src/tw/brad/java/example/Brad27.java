package tw.brad.java.example;

public class Brad27 {

	public static void main(String[] args) {
		System.out.println(Brad271.b);
		Brad271.m2();
		
		Brad271 obj1 = new Brad271();
		obj1.m1();
		
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		Bike b3 = new Bike();
		System.out.println(b2.counter);
	}

}
class Brad271 {
	int a;
	static int b = 3;
	Brad271(){
		System.out.println("Brad271()");
	}
	void m1() {
		System.out.println(a);
		System.out.println(b);
		m3();
	}
	static void m2() {
		System.out.println(b);
		m3();
		//m1();
	}
	static void m3() {
		System.out.println("m3()");
	}
}

