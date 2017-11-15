package tw.brad.java.example;

import java.util.Timer;
import java.util.TimerTask;

public class Brad79 {
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		Task t1 = new Task();
		timer.schedule(t1, 1*1000, 3*1000);
		System.out.println("OK");
	}

}

class Task extends TimerTask {
	private int i;
	@Override
	public void run() {
		System.out.println(i++);
	}
}
