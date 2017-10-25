package tw.brad.java.example;

public class Brad25 {

	public static void main(String[] args) {
		String a = "a123456789";
		if (a.matches("^[A-Z][12]23456789$")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
