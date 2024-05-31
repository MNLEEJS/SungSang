// 사용자에게 정수 하나를 입력받아
// 짝수이면 true
// 홀수면 false를 출력해보세요

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신이 입력한 정수가 짝수인지 홀수인지 말해드립니다.");
		
		int num = scanner.nextInt();
		
		System.out.println("당신이 입력한 숫자는" + num +"입니다.");
		System.out.print((num%2) == 0 && num > 0 );
		System.out.print("입니다.");
		
	}
}