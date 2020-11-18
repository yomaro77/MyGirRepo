package test.main;

public class array_1117 {
	public static void main(String[] args) {
		//String array1[] = {"hon", "kim", "kang", "lee", "choi"};
		String[] array1 = {"hon", "kim", "kang", "lee", "choi"};
		
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		String[] array2 = new String[4];
		for(int i=0; i<array2.length; i++) {
			array2[i] = "hi" + i;
			System.out.println(array2[i]);
		}
		
		for(String e : array1) {
			System.out.println(e);
		}
		
		
		
		
		

		
		int[] arr1 = {1, 3, 5, 7, 9};
		for(int e : arr1) {
			System.out.println(e);
		}
		
		String[] arr2 = {"you", "are", "why", "whoooooo"};
		for(String e : arr2) {
			System.out.println(e);
		}
		
		
		
	}
}
