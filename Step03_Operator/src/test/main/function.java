package test.main;

public class function {
	
	public static void arrName(String name) {
		System.out.println(name + "님 안녕하세요");
	}
	
	public static int avg(int a, int b) {
		int avg = (a + b) / 2;
		return avg;
	}

	public static void main(String[] args) {
		arrName("야");
		
		System.out.println(avg(10, 30));
		
	}
}
