public class Score {
	public static void main(String[] atgs){
		int kor = 80;
		int eng = 75;
		int math = 65;
		
		// 위의 국 영 수 점수의 총합과 평균을 출력해 보세요.
		System.out.println("국어점수" + kor);
		System.out.println("영어점수" + eng);
		System.out.println("수학점수" + math);
		
		System.out.println("총합" + (kor + eng + math));
		System.out.println("평균" + (kor + eng + math)/3);
		
		
		
		int average = (kor + eng + math) / 3;		
		System.out.println ( "평균 구하기" + average );
		
		
		int sum = ( kor + eng + math );
		int average2 = (sum / 3);
		System.out.println("평균 구하기2" + average2);
	}
}