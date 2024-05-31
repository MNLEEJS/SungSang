// 사용자가 두개의 정수를 입력받아
// 첫번째 입력받은 정수가 두번째 정수보다크고
// 첫번째 정수가 두번째 정수의 배수인 경우에 true

import java.util.Scanner;

public class Q4 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신이 원하는 숫자 두번을 입력하시오");
		System.out.println("첫번째 수입니다.");
		int first = scanner.nextInt();
		
		System.out.println("두번째 수입니다.");
		int second = scanner.nextInt();
		
		
		boolean one = first > second;
		boolean two = first % second == 0;
		boolean three = first > 0 && second > 0;
		
		
		System.out.print("당신이 적은 수는");
		System.out.print(one && two && three);
		
		
		
		
	}
}