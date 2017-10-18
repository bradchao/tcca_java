package tw.brad.java.example;

public class Brad09 {

	public static void main(String[] args) {
		int a = 101;
		final int b = 8;
		// byte, short, int, char, String
		//b = 8;
		switch (a) {
		case 1:
			System.out.println("A");
			break;
		default:
			System.out.println("D");
		case b+2:
			System.out.println("B");
			break;
		case 127:
			System.out.println("C");
			break;
		}
		System.out.println("Finish");
	}

}
