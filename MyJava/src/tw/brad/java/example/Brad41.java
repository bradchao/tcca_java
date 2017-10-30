package tw.brad.java.example;

import java.util.zip.DataFormatException;

public class Brad41 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
			b1.setLeg(2);
		} catch (Exception e) {
		}
	}

}
class Bird {
	private int leg;
	void setLeg(int n) throws DataFormatException {
		if (n>=0 && n<=2) {
			leg = n;
		}else {
			throw new DataFormatException();
		}
	}
}
class BirdV2 extends Bird {
	@Override
	void setLeg(int n){
	}
}
