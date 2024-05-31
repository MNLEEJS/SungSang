public class Const {
	public static void main(String[] args) {
		int userInput = 200 ;
	
		final int origin = userInput ;  // 상수로 바꿔주는 final // 처음의 단어를 보관 하는 방법
		
		userInput = 201 ;
		
		// origin = 202; //final로 인해 컴파일 에러 발생
		
		System.out.println(origin);
		}
}