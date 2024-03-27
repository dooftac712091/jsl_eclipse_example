package e_배열;

public class Array_2 {

	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		
		String[] b = {"가", "나", "다"};
		
		int sum = 0;
		String paragraph = "";
		
		for(int i : a) {
			sum += i;
		}
		
		for(String j : b) {
			paragraph += j;
		}
		
		int ave = sum / a.length;
		
		System.out.println("Sum : " + sum);
		System.out.println("Everage : " + ave);
		System.out.println("Paragraph : " + paragraph);
		
	}

}
