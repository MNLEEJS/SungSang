public class Swap {
	public static void main(String[] args) {
		int a = 20;
		int b = 70;
		int c = a; // 보관으로 a 값을 보관한다.
		
		a = b;
		// b = a;
		b = c;
		
		System.out.println(" a: " + a);
		System.out.println(" b: " + b);
		
		
	}
}