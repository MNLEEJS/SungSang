public class Circle {
	public static void main(String[] args){
		int radius = 5;
		double pi = 3.14;
		
		//원의 반지름이 5이고 PI값이 3.14알때,
		// 원의 넓이를 구해 출력해보세요.
		
		System.out.println("제곱값" + (radius * radius));
		System.out.println("넓이" + radius * radius * pi);
		
		// 내가 생각한 코딩
		
		int z = radius * radius ;  // 제곱값
		System.out.println(z * pi);  // 넓이
	}
}