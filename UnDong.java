// 사용자의 3대 운동(벤치, 데드리프트, 스쿼트) 중량을 입력받아
// 총 합이 500이상이면 true
// 미만인 경우는 false를 출력하는 프로그램

import java.util.Scanner;

public class UnDong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신의 3대 운동 총량을 입력하세요");
		System.out.println("당신의 벤치프레스 최대 무게를 입력하세요");
		int bench = scanner.nextInt();
		System.out.println("당신의 데드리프트 최대 무게를 입력하세요");
		int dead = scanner.nextInt();
		System.out.println("당신의 스쿼트 최대 무게를 입력하세요");
		int squat = scanner.nextInt();
		
		int three = bench + dead + squat;
		
		System.out.println(three >= 500);
		
		
	}
}