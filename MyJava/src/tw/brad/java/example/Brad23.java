package tw.brad.java.example;

public class Brad23 {
	public static void main(String[] args) {
		// 產生謎底
		String answer = createAnswer(3);
		System.out.println(answer);
		
	}
	
	static String createAnswer(int d) {
		int[] poker = new int[10];	// 0, 0, ... 0
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i=0; i<poker.length; i++) {
			int pos = (int)(Math.random()*(poker.length-i));	// 0 - 5
			
			// swap
			int temp = poker[pos];
			poker[pos] = poker[poker.length-i-1];	// ?
			poker[poker.length-i-1] = temp;
			
		}
		
		String ret = "";
		for (int i=0; i<d; i++) {
			ret += poker[i];
		}
		
		
		return ret;
	}
	
}
