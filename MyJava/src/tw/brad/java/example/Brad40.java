package tw.brad.java.example;

public class Brad40 {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int[] c = {1,2,3,4};
		try {
			System.out.println(a / b);
			System.out.println(c[4]);
//		}catch(ArrayIndexOutOfBoundsException ae) {
//			System.out.println(".....");
//		}catch(ArithmeticException ae) {
//			System.out.println(".....");
		}catch(RuntimeException ee) {
			System.out.println("eeeeee");
		}
		System.out.println("OK");
	}

}
