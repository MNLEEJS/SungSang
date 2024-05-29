public class Rectangle {
	public static void main(String[] args){
		// 아래의 변수는 직사각형의 가로, 세로 값입니다.
		int Width = 53;
		int height = 80;
		
		// 직사각형의 넓이를 구해 출력해보세요.
		int area = Width * height ;
		System.out.println("직사각형의 가로" + Width);
		System.out.println("직사각형의 세로" + height);
		System.out.println("직사각형의 넓이" + area);
		
		// 직사각형의 둘레를 구해 출력해보세요.
		//System.out.println("직사각형의 둘레" + (Width + height) * 2); 
		
		int sum = Width + height ;
		int perimeter = sum * 2;
		System.out.println("직사각형의 둘레" + perimeter);
	}
}