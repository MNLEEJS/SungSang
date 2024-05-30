public class Print3 {
	public static void main(String[] args){
		System.out.printf("일반적인");
		System.out.printf("문자열 출력");
		System.out.println();
		System.out.printf("정수값 %d 하나 출력\n" , 100);
		System.out.printf("정수값 %d, %d 출력\n" , 200, 300);  // %d는 같은 ()안에 들어있는 정수 순서에 맞게 출력
		
		
		//System.out.printf("%d %d %d",400);  // 에러가 뜨면 아래쪽으로 흘러가지 않고 바로 프로그램이 종료가 된다.
											// printf를 사용 할 때 갯수를 잘 체크 해야한다.
											
		
		//System.out.printf("%d", 3.5); // %d는 정수라서 에러가 발생
		
		System.out.printf("%.2f\n", 3.5); //.2를 추가하여 표한하고싶은 소수점까지만 표현
											//%f가 실수를 표현
		System.out.printf("%s\n", "문자열은 s");  // 문자열을 나타낼 때는 %s  sping
		System.out.printf("%b\n", true);		// boolean 값을 대신할수 있는 서식문자
		
		System.out.println("정상적인 프로그램 종료");
	}
}