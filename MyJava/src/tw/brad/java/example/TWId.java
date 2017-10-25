package tw.brad.java.example;

public class TWId {
	private String id;
	public TWId() {
		
	}
	public TWId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public boolean isMale() {
		return true;
	}
	public String getArea() {
		return "A";
	}
	
	public static boolean isRight(String id) {
		// 1. length = 10
		// 2. charAt(0) = [A-Z]
		// 3. charAt(1) = [12]
		// 4. charAt(2-9) = [0-9]
		// 5. 檢查碼
		
		
		return true;
	}
	
}
