// 프로그램 사용자에게 정수 2개를 콘솔 입력받아
// 모두 출력하는 프로그램

//(변수는 하나의 값만을 저장할수 있어요)
import java.util.Scanner;

public class TwoNumbers {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요");
		int num1 = scanner.nextInt();  // 입력한 정수를 저장하기 위한 공간 만들기
		System.out.println("정수를 하나 입력하세요");
		int num2 = scanner.nextInt();
		System.out.println("입력하신 첫번째 숫자는" + num1);
		System.out.println("입력하신 두번째 숫자는" + num2);
		System.out.println("입력하신 숫자는 " + num1 + " 와 " +  num2 + " 입니다 ");
		System.out.println("입력하신 두수의 합은" + (num1 + num2));
		
	}
}