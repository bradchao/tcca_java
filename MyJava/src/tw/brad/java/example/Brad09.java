package tw.brad.java.example;

public class Brad09 {

	public static void main(String[] args) {
		int a = 10;
		// byte, short, int, char, String 
		switch (a) {
		case 1:
			System.out.println("A");
			break;
		case 10:
			System.out.println("B");
			break;
		case 100:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
		System.out.println("Finish");
	}

}
