public class AutoIncrement3 {
	public static void main(String[] args) {
		byte b = 127;
		// b의 값을 1 증가시키고 결과값 확인
		//b = b + 1 대입연산자는 에러 발생 // overflow 발생했다고 표현한다.
		b+= 1; // 증감연산자는 실행 가능 
		System.out.println(b);
		
		double d = 1.5;
		// d의 값을 1 증가시키고 결과값 확인
		System.out.println(++d);
		
	}
}