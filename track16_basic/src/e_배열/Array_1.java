package e_배열;

public class Array_1 {
	
	public static void main(String[] args) {
		
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		String[] b = new String[3];
		b[0] = "가";
		b[1] = "나";
		b[2] = "다";
		
		for (String i : b) {
			System.out.println(i);
		}
		
		System.out.println("배열의 길이 : " + b.length);
	}
	
}
