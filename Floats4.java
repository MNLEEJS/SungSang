public class Floats4 {
	public static void main(String[] args) {
		double d = 123.456;  // (64bit) 8byte
		float f = 12.43F; // float 값의 마지막에는 F를 붙여주어야 한다.  (32bit) 4byte
		
		float b = 10.0F;
		float c = 3.0F;
		
		
		System.out.println(b/c);
	}
}



// 10진수 체계에서 10/3에서 float는 근사값으로 표현
// 근사값끼리의 연산이 있으면 오차가 발생했었음
// 부동소수점 방식은 정확도가 오차를 발생 시킬수있다.
// folat 은 크기가 작아 표현할수 있는 유효자리가 작다. 
// 연산을 계산하는 오차가 커짐
// double 은 folat의 유효자리를 2배 올려 놓음