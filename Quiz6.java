// 6. 초단위의 시간을 입력받아
// # 시 # 분 # 초로 단위 환산하여 출력하는 프로그램
// 입력예) 3666 => 출력예) 1시간 1분 6초

import java.util.Scanner;

public class Quiz6 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		System.out.println("초단위를 입력하시오.");
		int a = S.nextInt();
		
		int b = a / 3600;
		int c = (a % 3600) / 60;
		int d = ((a % 60) % 60) / 1;
				
		System.out.println("입력한 초의 정확한 시각은");
		System.out.printf("\n%d"+ "시" + "%d" + "분" + "%d" + "초 입니다." , b , c , d);
	}
}