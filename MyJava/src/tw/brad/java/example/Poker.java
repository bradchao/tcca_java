package tw.brad.java.example;

public class Poker {

	public static void main(String[] args) {
		// 洗牌 => poker[]
		long start = System.currentTimeMillis();
		int[] poker = new int[52];	// 0, 0, ... 0
		for (int i=0; i<poker.length; i++) {
			int temp = (int)(Math.random()*52);
			
			// 檢查機制
			boolean isR = false;
			for (int j=0; j<i; j++) {
				if (temp == poker[j]) {
					isR = true;
					break;
				}
			}
			
			if (isR) {
				i--;
				continue;
			}else {
				poker[i] = temp;
				System.out.println(poker[i]);
			}
			
		}
		System.out.println("----");
		System.out.println(System.currentTimeMillis() - start);
		
		
		// 發牌 => players[4][13]
		
		// 攤牌 => for-each => 理牌
		
	}

}