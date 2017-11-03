package tw.brad.java.example;

public class Brad56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Student {
	int ch, math, eng;
	Student(int ch, int math, int eng){
		this.ch = ch; this.math = math; this.eng = eng;
	}
	int calSum() {
		return ch + math +eng;
	}
	double calAvg() {
		return calSum() / 3.0;
	}
}
