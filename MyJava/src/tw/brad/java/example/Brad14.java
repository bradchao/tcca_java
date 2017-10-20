package tw.brad.java.example;

public class Brad14 {
	public static void main(String[] args) {
		int[] p = new int[6];	// [0-5]
		for (int i=0; i<1000000; i++) {
			int point = (int)(Math.random()*9) ;	// 0 - 8 => 0 - 5, 6,7,8
			p[point>=6?point-3:point]++;
		}
		for (int i=0; i<p.length; i++) {
			System.out.println((i+1) +"點出現" + p[i] + "次");
		}
	}

}
