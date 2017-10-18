package tw.brad.java.example;

public class Brad12 {

	public static void main(String[] args) {
		for (int j=0; j<=9; j++) {
			for (int i=1; i<=10; i++) {
				int n = i + j * 10;
				
				boolean isP = true;
				for (int k=2; k<n; k++) {
					if (n % k == 0) {
						// 
						isP = false;
						break;
					}
				}
				
				System.out.print(n + (isP?"* ":"  "));
			}
			System.out.println();
		}
	}

}
