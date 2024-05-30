public class Prints2{ // \t는 탭
	public static void main(String[] args){
		
		int a = 100;
		int b = 80;
		int c = 70;
		
		System.out.println("국어\t영어\t수학");
		System.out.println();
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.printf("%d + %d = %d" , num1, num2, num1 + num2 );
	}
}