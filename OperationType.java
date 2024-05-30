public class OperationType {
	public static void main(String[] args){
		System.out.println( 1 + 5);
		
		System.out.println( 1.4 + 5.7);
		
		System.out.println( (int) 1.4 + 5.7);  // 형변환이 먼저 수행 / 정수 + 실수
		
		System.out.println(1.4 + (int) 5.7);  // 실수 + 정수
		
		System.out.println((int) 1.4 + (int) 5.7); // 정수 + 정수
	}
}