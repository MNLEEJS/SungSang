public class Assign {
	public static void main(String[] args) {
		int num = 0;
		
		num = 80;
		
		num = num +10;
		
		System.out.println(num);
		
		//num = num + 10;
		num += 10; // 복합 대입 연산자
	
		System.out.println(num);
		
		//num = num - 50;
		num -= 50;
		//	주의사항 : += 이걸 =+이렇게 적으면 부호로 의미한다. 
		//	ex) num =- 50;
		//	   출력값 =- 50
		
		System.out.println(num);
		
		num *= 3;
		
		System.out.println(num);
		
		num /= 15;
		
		System.out.println(num);
		
		num %= 7;
		
		System.out.println(num);
	}
}