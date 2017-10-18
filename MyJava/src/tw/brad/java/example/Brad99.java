package tw.brad.java.example;

public class Brad99 {

	public static void main(String[] args) {
		for (int y=1; y<=9; y++) {
			for (int x = 2; x<=5; x++) {
				int r = x * y;
				System.out.print(x + " x " + y + " = " + r + "\t");
			}
			System.out.println();
		}
	}

}
