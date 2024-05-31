public class AtuoIncrement2 {
	public static void main(String[] args) {
		int i = 11;
		
		i++;
		System.out.println(++i); //i++ 연산의 순서로 인해 증감하지 않음
		System.out.println(i++); //i++ 연산 순서로 인해 다음 출력에 적용
		System.out.println(i++);
		
	}
	
}