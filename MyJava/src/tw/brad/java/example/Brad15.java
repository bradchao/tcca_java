package tw.brad.java.example;

public class Brad15 {
	public static void main(String[] args) {
		int[][] a1;
		int[] a2[];
		int a3[][];
		
		a1 = new int[3][4];
		a2 = new int[3][];
		a2[0] = new int[]{1,2,3,4};
		a2[1] = new int[]{11,22};
		a2[2] = new int[]{55,66,77,88,99};
		
		System.out.println(a2.length);
		System.out.println(a2[0].length);
		
		for(int i=0; i<a2.length; i++) {
			for (int j=0; j<a2[i].length; j++) {
				System.out.print(a2[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("-----");
		for (int[] v : a2) {
			for (int value : v) {
				System.out.print(value + "  ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
