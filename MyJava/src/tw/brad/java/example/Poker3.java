package tw.brad.java.example;

public class Poker3 {

	public static void main(String[] args) {
		// 洗牌 => poker[]
		long start = System.currentTimeMillis();
		int[] poker = new int[52];	// 0, 0, ... 0
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i=0; i<poker.length; i++) {
			int pos = (int)(Math.random()*(poker.length-i));	// 0 - 5
			
			// swap
			int temp = poker[pos];
			poker[pos] = poker[poker.length-i-1];	// ?
			poker[poker.length-i-1] = temp;
			
		}
		
		for (int v : poker) {
			System.out.println(v);
		}
		System.out.println("----");
		System.out.println(System.currentTimeMillis() - start);

		
		// 發牌 => players[4][13]
		
		// 攤牌 => for-each => 理牌
		
	}

}
