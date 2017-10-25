package tw.brad.java.example;

public class Brad24 {

	public static void main(String[] args) {
		TWId id1 = new TWId(true,1);
		System.out.println(id1.getId());
		if (TWId.isRight(id1.getId())) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
