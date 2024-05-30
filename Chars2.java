public class Chars2 {
	public static void main(String[] args){
		char a = 65;           // 2byte 크기
		
		System.out.println(a);
		
		a=66;
		
		System.out.println(a);
		// 예외적인 상황
		// 컴파일러가 사용자를 위해 자동으로 형변환 해준 사례
		int num = a ; //형변환 발생 /문자는 int보다 작은공간이라 자동 변환 가능 4byte 크기 
		
		System.out.println(num);
	}
}