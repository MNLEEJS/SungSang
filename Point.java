// 사용자의 국어, 영어, 수학 점수를 입력받아
// 총점과 평균을 출력해 보세요

// ( 정수 데이터 활용 )

import java.util.Scanner;

public class Point {
	public static void main(String[] args){
		Scanner S = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하여 주세요.");
		int k = S.nextInt();
		
		System.out.println("수학점수를 입력하여 주세요.");
		int m = S.nextInt();
		
		System.out.println("영어점수를 입력하여 주세요.");
		int e = S.nextInt();
		
		int sum = k + m + e ;
		
		float average = (float) sum / 3 ;
		
		System.out.println("시험점수의 총합은" + sum + "입니다.");
		
		System.out.println("시험점수의 평균은" + average + "입니다.");
	}
	
}