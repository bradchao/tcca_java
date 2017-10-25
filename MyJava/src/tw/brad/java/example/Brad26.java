package tw.brad.java.example;

public class Brad26 {

	public static void main(String[] args) {
		Brad261 obj1 = new Brad261(2,3);
	}

}

class Brad261 {
	Brad261(){
		System.out.println("Brad261()");
	}
//	Brad261(int a){
//		System.out.println("Brad261(int)");
//	}
	Brad261(long a){
		System.out.println("Brad261(long)");
	}
	Brad261(float a){
		System.out.println("Brad261(float)");
	}
	Brad261(double a){
		System.out.println("Brad261(double)");
	}
//	Brad261(float a, double b){
//		System.out.println("Brad261(float,double)");
//	}
	Brad261(double a, float b){
		System.out.println("Brad261(double,float)");
	}
}
