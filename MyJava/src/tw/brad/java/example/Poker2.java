package tw.brad.java.example;

public class Poker2 {

	public static void main(String[] args) {
		// 洗牌 => poker[]
		int[] poker = new int[6];	// 0, 0, ... 0
		boolean isR;
		int temp;
		for (int i=0; i<poker.length; i++) {
			do {
				temp = (int)(Math.random()*6);
				
				// 檢查機制
				isR = false;
				for (int j=0; j<i; j++) {
					if (temp == poker[j]) {
						isR = true;
						break;
					}
				}
			}while (isR);
			
			poker[i] = temp;
			System.out.println(poker[i]);
			
		}
		// 發牌 => players[4][13]
		
		// 攤牌 => for-each => 理牌
		
	}

}
