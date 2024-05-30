// 잔돈 계산기

// 전달 받은 금액과 상품의 가격을 콘솔에 입력받아
// 거스름돈을 출력하는 프로그램

//(정수 데이터를 활용합니다)

import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("물건의 가격을 입력해 주세요");
		int n1 = s.nextInt();
		
		System.out.println("물건의 가격은" + n1 + "원 입니다.");
		
		System.out.println("받은 돈을 입력해 주세요");
		
		int n2 = s.nextInt();
		
		System.out.println("받은 돈은" + n2 + "원 입니다.");
		
		int n3 = n2 - n1 ;
		
		System.out.println("거스름돈은" + n3 +  "원 입니다.");
	}
	
}