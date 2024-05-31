// 사용자의 입력값이
// 100이상 200미만의 수이고
// 3의 배수인 경우는 true
// 범위는 벗어나거나, 3의 배수가 아닌 경우는 false

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신이 적은 수가 true인지 확인하시오");
		int user = scanner.nextInt();
		
		boolean user1 = 100 <= user && user < 200; 
		boolean user2 = user % 3 == 0;
		
		
		
		
		//System.out.println("당신이 적은 수는" + user + " 입니다.");
		//System.out.println(100 <= user &&
		//					user < 200 && 
		//					user % 3 == 0 );
		
		
		
	}
}