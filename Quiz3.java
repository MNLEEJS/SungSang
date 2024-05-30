// 단위 환산 프로그램 
// 키를 cm 단위(정수)로 입력받아
// x ft x inch형태로 출력하기 (1ft = 12inch , 1inch = 2.54cm)

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args){
		Scanner S = new Scanner(System.in);
		
		System.out.println("당신의 키를 입력하세요.");
		double a = S.nextDouble();
		double b = a / 2.54 ;
		double c = b / 12;
	
		System.out.println("당신의 키는" + (int) a + "cm 입니다.");
		System.out.printf("당신의 키는" + "%.2f" + "inch 입니다." , b);
		System.out.printf("\n당신의 키는" + "%.2f" + "ft 입니다." , c );
	}
}