package e_배열;

public class Array_6 {

	public static void main(String[] args) {
		String[] str = {"홍길동", "50", "60", "70", "80", "90", "80", "90", "80", "90", "80", "90", "80", "90"};
		int sum = 0;

		for(int i = 0; i < str.length; i++) {
			
			if(i != 0) {
				sum += Integer.parseInt(str[i]);
				System.out.print(str[i] + " ");
				if(i % 5 == 0) {
					System.out.println("");
				}
			} else {
				System.out.println(str[i]);
			}
		}
		System.err.print(sum);
	}

}
