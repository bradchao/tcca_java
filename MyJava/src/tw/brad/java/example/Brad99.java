package tw.brad.java.example;

public class Brad99 {

	public static void main(String[] args) {
		for (int z=0; z<4; z++) {
			for (int y=1; y<=9; y++) {
				for (int x = 2; x<=5; x++) {
					int newx = x + z*4;
					int r = newx * y;
					System.out.print(newx + " x " + y + " = " + r + "\t");
				}
				System.out.println();
			}
			System.out.println("----");
		}
	}

}
