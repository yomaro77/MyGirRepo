package test.main;
/*
 * 3. 비교 연산자 테스트
 * - 비교 연산의 결과는 boolean type 이다
 * ==, !=, >, >=, <, <=
 */
public class MainClass03 {
	public static void main(String[] args) {
		boolean result1 = 10==10;
		boolean result2 = 10!=10;
		boolean result3 = 10>100;
		boolean result4 = 10>=10;
		boolean result5 = 10<100;
		boolean result6 = 10<=10;
		
		String name=null;
		
		boolean result7 = name==null;
		boolean result8 = name!=null;
	}
}
