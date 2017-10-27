package tw.brad.java.example;

public class Brad33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface Brad331 {
	void m1();	// public abstract
	int m2(double a);
}
class Brad332 implements Brad331 {
	public void m1() {
		
	}
	public int m2(double a) {
		return 0;
	}
}
interface Brad33a {
	void m1();
}
interface Brad33b {
	void m2();
}
interface Brad33c extends Brad33a, Brad33b {
	void m3();
}
abstract class Brad333 implements Brad33c {
	public void m1() {}
	public void m2() {}
}
class Brad334 extends Brad333 {
	public void m3() {}
}










