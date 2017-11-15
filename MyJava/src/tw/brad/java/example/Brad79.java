package tw.brad.java.example;

import java.util.Timer;
import java.util.TimerTask;

public class Brad79 {
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		Task t1 = new Task();
		timer.schedule(t1, 1*1000, 1*1000);
		StopTimer t2 = new StopTimer(timer);
		timer.schedule(t2, 10*1000);
		
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

class StopTimer extends TimerTask {
	private Timer timer;
	StopTimer(Timer timer){this.timer = timer;}
	@Override
	public void run() {
		timer.cancel();
	}
}
