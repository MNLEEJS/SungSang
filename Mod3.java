public class Mod3 {
	public static void main(String[] args){
		int seconds = 133;
		
		//위 변수를 초 단위의 값입니다.
		// xx분 xx초로 변환하여 출력해보세요.
		System.out.println(seconds / 60 + "분");
		System.out.println(seconds % 60 + "초");
		
		
		// 내가 생각한 코딩 
		int a = seconds / 60;
		int b = seconds % 60;
		
		System.out.println(a + "분" + b + "초");
	}
}