package tw.brad.java.example;

public class Brad37 {
	public static void main(String[] args) {
		Brad371 obj1 = new Brad371();
		Brad371 obj2 = new Brad371();
		Brad371 obj3 = new Brad371();
		obj1.m1();
		obj2.m1();
		obj3.m1();
		System.out.println("----");
		//Brad37211 obj4 = new Brad37211();
		Brad37211.m1();
		
	}
}
class Brad371 {
	int a = 10;
	static int b = 100;
	Brad371(){
		System.out.println("Brad371()");
	}
	void m1() {
		System.out.println("Brad371:m1()");
	}
	static void m2() {
		System.out.println("Brad371:m2()");
	}
	{
		System.out.println("{}:" + a);
		m1();
	}
	static {
		System.out.println("static{}");
	}
}
class Brad372 {
	static {System.out.println("Brad372():static{}");}
	{System.out.println("Brad372():{}");}
	Brad372(){System.out.println("Brad372()");}
}
class Brad3721 extends Brad372 {
	static {System.out.println("Brad3721():static{}");}
	{System.out.println("Brad3721():{}");}
	Brad3721(){System.out.println("Brad3721()");}
}
class Brad37211 extends Brad3721{
	static {System.out.println("Brad37211():static{}");}
	{System.out.println("Brad37211():{}");}
	Brad37211(){System.out.println("Brad37211()");}
	static void m1() {}
}
