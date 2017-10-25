package tw.brad.java.example;

public class Brad29 {
	public static void main(String[] args) {
		Brad291 obj1 = new Brad291(2);
	}
}

class Brad291 extends Object {
//	Brad291(){
//		System.out.println("Brad291()");
//	}
	Brad291(int a){
		// super()
		System.out.println("Brad291(int)");
	}
}
class Brad292 extends Brad291 {
	Brad292(){
		// super()
		super(2);
	}
}
