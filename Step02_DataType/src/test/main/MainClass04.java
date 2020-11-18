package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main method start");
		/* 1. 각각의 점수를 지역변수 eng, kor, math에 대입해보세요.
		 * 영어점수 : 100
		 * 국어점수 : 100
		 * 수학점수 : 90
		 */
		
		int eng = 100;
		int kor = 100;
		int math = 90;
		
		//2. eng, kor, math 세 점수의 합을 sum 이라는 이름의 지역변수에 담아보세요.
		int sum = eng + kor + math;
		
		//3. eng, kor, math 의 평균값을 구해서 ave 라는 이름의 지역 변수에 담아 보세요.
		double ave = sum/3;
		
		//4. ave 안에 들어 있는 값을 콘솔창에 출력해보세요.
		System.out.println(ave);
		
	}
}
