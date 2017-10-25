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
		boolean ret = false;
		if (id.matches("^[A-Z][12][0-9]{8}$")) {
			// 5. 檢查碼
			String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
			int n12 = letters.indexOf(id.charAt(0)) + 10;
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			System.out.println(n1 + ":" + n2);
			
		}
		
		
		return ret;
	}
	
}
