public class AutoCasting {
	public static void main(String [] args) {
		int i =1000;
		long l = i;  // 자동 형변환(AutoCasting) 작은공간에 있는 값을 넓은 공간으로 옮길 때 일어난다.
		
		System.out.println(l);
		
		
		
		long num = 100L;		//8byte의 공간을 가지고 있다.
		float f = num;			//4byte의 공간을 가지고 있다.  (float의 공간은 작으나 표현할수있는 지수의 값이 long보다 넓다.)
		
		System.out.println(f);
		
		//float pi = 3.14F;
		//long three = pi; // 컴파일 에러 (long의 공간이 크더라도 소수점표현이 불가능하여 에러 발생)
		
		
		//long zero = 0L;
		//int var = zero;  //컴파일 에러 (넓은 공간을 좁은 공간으로 옮기면 에러가 일어난다.)
		
		
	}
}