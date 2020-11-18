package test.main;
/*
 *  [ java 참조 데이터 type ]
 *  
 *  String type
 *  
 *  - 문자열을 다룰때 사용하는 데이터 type 이다.
 *  - 참조 데이터 type 변수에는 참조값(id) 값이 들어 있다.
 */
public class MainClass07 {
	public static void main(String[] args) {
		System.out.println("start");
		
		String name="김구라";
		String myName=name;
		
		name="원숭이";
		name=null;
	}
}
