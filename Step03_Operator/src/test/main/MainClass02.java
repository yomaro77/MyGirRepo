package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		int num=0;
		num++;
		num++;
		num++;
		
		int num2=0;
		num2--;
		num2--;
		num2--;
		
		int num3=0;
		int result1=++num3;
		
		int num4=0;
		
		int result2=num4++;
		
		num=0;
		num2=0;
		int result3 = num-- + ++num2;
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
	}
}
