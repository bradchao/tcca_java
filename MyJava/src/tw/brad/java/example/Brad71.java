package tw.brad.java.example;

public class Brad71 {

	public static void main(String[] args) {
		String a = "123";
		String b = "123";
		System.out.println(a == b);
		Integer i1 = new Integer(123);
		Integer i2 = new Integer(123);
		System.out.println(i1 == i2);
		Integer i3 = -129;
		Integer i4 = -129;
		System.out.println(i3.equals(i4));
		
		byte i5 = 123;
		int i7 = i5;		// 自動轉型
		Integer i6 = i7;	// 自動封箱

		m1(i5);
		m1(123);
		m1(i7);
		m1(i6);
		
		
	}
	
	static void m1(int a) {
		System.out.println("OK1");
	}
	static void m1(Integer a) {
		System.out.println("OK2");
	}
	

}