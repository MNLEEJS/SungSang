public class Casting {
	public static void main(String[] args) {
		double pi = 3.14;
		
		int three = (int) pi; // 명시적 형변환 (실수를 굳이 표현하지 않더라도 정수만 표현하기 위한 형변환)
		
		System.out.println(three);
		
		
		int num = 128;
		
		byte b = (byte) num;
		
		System.out.println(b);
	}
}