public class Integers {
	public static void main(String[] args){
		byte b= 10;  // byte도 정수를 나타냄
	
		System.out.println(b);
		
		long l = 92_837_498_373L;
		
		// 롱을 사용하려면 마지막에 L을 붙여줘야 한다. 붙이지 않으면 int로 인식을 한다.
		// 소문자로 해도 상관은 없으나 추후 확인할 때 숫자 1 처럼 인식됨
		// long l = 92_837_498_373L; 
		
		System.out.println(l);
	}
}

//정수를 나타내는 기초형
// bit = 0 or 1
// byte = 2진수 8bit 까지의 범위
// short = 2byte 까지의 범위 (2진수 16bit)
// int = 4byte 까지의 범위 (2진수 32bit)
// long = 8byte 까지의 범위 (2진수 64bit)
// 컴퓨터의 공간은 무한하지 않음.
// 공간을 너무 차지 하지 않고 알맞게 사용하기 위해 int를 자주 사용