package tw.brad.java.example;

public class Brad28 {

	public static void main(String[] args) {
		Brad281 obj1 = new Brad281();
		obj1.m1();
		Brad281 obj2 = new Brad282();
		obj2.m1();
		System.out.println(obj2.a);
	}

}
class Brad281{
	int a = 10;
	void m1() {
		System.out.println("Brad281:m1()");
	}
}
class Brad282 extends Brad281 {
	
}
