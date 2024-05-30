import java.util.Scanner; //Scanner라는 데이터를 사용하기 위해 작성 

public class Input {
	public static void main(String[] args){
		
		//기능 = 메소드 
		
		System.out.println("프로그램 시작"); // 출력 메소드 호출
		
		// 변수의 선언 부분 = // 대입의 초기화 과정  // Scanner 라는 자료형
		// new Scanner(System.in) 스캐너 입력하는 방법
		// Scanner의 목적은 입력을 받는 목적은
		
		Scanner scan = new Scanner(System.in);  
		
		System.out.println("정수를 입력하세요");
		
		// nextInt는 콘솔입력하는 메소드
		
		int num = scan.nextInt();  // 입력 메소드 호출
		
		System.out.println("입력하신 정수는" + num + "입니다");
		
		System.out.println("프로그램 종료");
	}
}