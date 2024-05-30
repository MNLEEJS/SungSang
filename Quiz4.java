// 4. 사용자에게 5자리의 정수를 입력받아
// 역순으로 출력하는 프로그램

// 입력예) 12345 => 출력예) 54321

import java.util.Scanner;

public class Quiz4{
	public static void main(String[] args){
		Scanner S = new Scanner(System.in);
		
		System.out.println("당신이 원하는 숫자 5가지를 입력하시오.");
		int a = S.nextInt();
		
		long n5 = a / 10000L; 
		long n4 = (a % 10000) / 1000L; 
		long n3 = ((a % 10000) % 1000) / 100L;
		long n2 = (((a % 10000) % 1000) % 100) /10L;
		long n1 = ((((a % 10000) % 1000) % 100) %10) /1L;
		
		
		System.out.printf("\n%d%d%d%d%d" , n1 , n2, n3, n4, n5);
		//System.out.print
		//System.out.print
		//System.out.print
	}
}