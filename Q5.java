// 사용자에게 세 정수를 입력받아
// 각 정수의 입력의 크기 순으로 입력되었다면 true
// 각 정수간 차이가 같다면 tue

import java.util.Scanner;

public class Q5 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("세개의 정수를 입력하시오.");
		System.out.println("세개의 정수가 크기순으로 되었다면 통과.");
		System.out.println("첫번째 정수를 적으시오.");
		
		int first = scanner.nextInt();
		
		System.out.println("두번째 정수를 적으시오.");
		int cecond = scanner.nextInt();
		
		System.out.println("세번째 정수를 적으시오.");
		int third = scanner.nextInt();
		//boolean one = first < cecond && first < third ;
		//boolean two = cecond > first && cecond < third ;
		//boolean three = third > first && cecond < third ;
		boolean four = cecond - first == third - cecond;
		boolean five = first < cecond ;
		
		//System.out.println(one && two && three && four );
		System.out.println(five && four );
	}
}