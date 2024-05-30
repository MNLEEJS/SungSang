// 2. 사과가 여러개 있을 때,
// 포장을 하려고 합니다.
// 한 상자에 들어갈 수 있는 개수와 총 사과 갯수를 입력받고 
// 필요한 사과 상자 개수와 상자를 채우지 못해 포장이 되지않은 사과 개수를 출력

// 입력 예) 박스 : 10 총사과 : 65
// 출력 예) 포장된 사과박스 : 6개 , 포장되지 않은 사과 개수 : 5개

import java.util.Scanner;

public class Quiz1{
	public static void main(String[] args){
		Scanner S = new Scanner(System.in);
		
		System.out.println("사과의 총 갯수를 적으시오.");
		int a = S.nextInt();
		
		System.out.println("박스의 총 갯수를 적으시오.");
		int b = S.nextInt();
		
		int b2 = a / 10 ;
		int a2 = a % 10 ;
		int c = b - b2 ;
		
		System.out.println("당신이 담을 수 있는 상자는 : " + b2 + "개" );
		System.out.println("당신이 상자에 담지 못한 사과는 : " + a2 + "개" );
		System.out.println("당신이 사과를 담지 못한 상자는 : " + c + "개" );
		
	}
}