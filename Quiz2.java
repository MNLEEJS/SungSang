// 1. 사용자의 체중(정수 kg 단위)을 입력받아
// 일일 권장 단백질 섭취량을 계산해 출력하는 프로그램
// (일일 권장 단백질은 1kg) 당 0.8~1.5g 입니다.

// 입력 예) 72 => 출력 예)57.6 ~ 108.0 g\

import java.util.Scanner;

public class Quiz2{
	public static void main(String[] args){
		Scanner S = new Scanner(System.in);
		
		System.out.println("당신의 육중한 몸무게를 적어주세요.");
		int a = S.nextInt();
		System.out.println("당신의 몸무게는" + a + "kg이나 나가네요");
		float b = a / 0.8f ;
		float c = a / 1.5f ;
		System.out.printf("당신은 단백질을" + (int) c + " ~ " + (int) b + "정도 먹어야 합니다.");	
	}
}