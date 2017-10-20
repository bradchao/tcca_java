package tw.brad.java.example;

public class Brad14 {
	public static void main(String[] args) {
		int[] p = new int[6];	// [0-5]
		for (int i=0; i<100; i++) {
			int point = (int)(Math.random()*6) ;	// 0 - 5
			p[point]++;
		}
		for (int i=0; i<p.length; i++) {
			System.out.println((i+1) +"點出現" + p[i] + "次");
		}
	}

}
