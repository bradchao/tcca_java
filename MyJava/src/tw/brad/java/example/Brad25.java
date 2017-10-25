package tw.brad.java.example;

public class Brad25 {

	public static void main(String[] args) {
		String a = "A123456789";
		if (a.matches("^09[0-9]{2}-[0-9]{6}$")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
