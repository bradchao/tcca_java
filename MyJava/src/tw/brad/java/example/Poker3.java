package tw.brad.java.example;

import java.util.Arrays;

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
		
//		for (int v : poker) {
//			System.out.println(v);
//		}
//		System.out.println("----");
//		System.out.println(System.currentTimeMillis() - start);
//		System.out.println("----");
		
		// 發牌 => players[4][13]
		int[][] players = new int[4][13];
		for (int i=0; i<poker.length; i++) {
			players[i%4][i/4] = poker[i];
		}
		
		// 攤牌 => for-each => 理牌
		String[] suits = {"黑桃","紅心","方塊","梅花",};
		String[] values = {"A ","2 ","3 ","4 ","5 ","6 ","7 ",
				"8 ","9 ","10","J ","Q ","K "};
		for (int[] player : players) {
			Arrays.sort(player);
			for (int card : player) {
				System.out.print(suits[card/13] + values[card%13] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
