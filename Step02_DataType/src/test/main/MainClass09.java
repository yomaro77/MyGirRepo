package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		//변수를 미리 만들어 두고 값을 나중에 대입해서 사용할거라면 기본값을 대입해 두는것이 좋다.
		int num1=0;
		
		for(int i=0; i<10; i++) {
			num1 = num1+1;
		}
		
		System.out.println(num1);
		
		String str=null;
		
		str="어쩌구.. 저쩌구..";
	}
}
