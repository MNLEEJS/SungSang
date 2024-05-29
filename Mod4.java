public class Mod4 {
	public static void main(String[] args){
		int money = 45000;
		
		// 위 금액을 지폐로 환산하면
		// 만원권, 천원권의 개수를 구해 출력해 보세요
		
		System.out.println("총금액" + money);
		System.out.println("만원권 개수" + money / 10000);
		System.out.println("천원권 개수" + money % 10000/1000);
		
		//내가 생각한 코딩 
		int a = money / 10000;
		int b = (money % 10000) / 1000;
		
		System.out.println("만원권 갯수 = " + a );
		System.out.println("천원권 갯수 = " + b );
	}
}