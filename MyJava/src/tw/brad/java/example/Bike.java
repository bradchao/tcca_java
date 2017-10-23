package tw.brad.java.example;

public class Bike {
	private double speed;	// 0.0
	private int color;	// 0
	
	Bike(){
		color = 1;
		System.out.println("OK");
	}
	Bike(int newcolor){
		color = newcolor;
	}
	
	int getColor() {
		return color;
	}
	
	void upSpeed() {
		speed = speed<1?1:speed*1.2;
	}
	
	void upSpeed(int gear) {
		speed = speed<1?1:speed*(1.2+gear);
	}
	
	void downSpeed() {
		speed = speed<1?0:speed*0.7;
	}
	
	double getSpeed() {
		return speed;
	}
	
//	@Override
//	public String toString() {
//		return "Brad Bike";
//	}
	
}
