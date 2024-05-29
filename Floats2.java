public class Floats2 {
	public static void main(String[] args){
		// int는 소수점이 없는 정수 int pi = 3.14는 사용 불가
		// 실수를 적을땐 double을 사용한다.
		double pi = 3.14;
		
		System.out.println(pi);
		// double에게 정수를 부여하더라도 소수점 한자리는 표현된다.
		// 형변환(casting)이 일어나 정수형이 실수형이 되었다.
		double num = 10;
		
		System.out.println(num);
		
	}
}