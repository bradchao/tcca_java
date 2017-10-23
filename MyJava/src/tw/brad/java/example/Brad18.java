package tw.brad.java.example;

public class Brad18 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		System.out.println(b1.getSpeed());
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		System.out.println(b1.getSpeed());
		b1.downSpeed();
		b1.downSpeed();
		b1.downSpeed();
		b1.downSpeed();
		b1.downSpeed();
		System.out.println(b1.getSpeed());
		
		Bike b2 = new Bike();
		b2.upSpeed(4);
		b2.upSpeed(3);
		System.out.println(b2.getSpeed());
		
		
	}

}
