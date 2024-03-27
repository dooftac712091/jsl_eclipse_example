package d_반복문;

import java.util.Scanner;

public class While_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단 수를 입력해주세요 : ");
		
		int num = sc.nextInt();
		
		int i = 1;
		
		while(i <= 9) {
			System.out.printf("%d X %d = %d\n", num, i, (num * i));
			i++;
		}
	}
}
