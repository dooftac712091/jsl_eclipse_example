package b_if;

import java.util.Scanner;

public class if_9 {
	
	// 몇 월입니까?

	// 12, 1, 2
	// 3, 4, 5
	// 6, 7, 8
	// 9, 10, 11
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 월인지 입력해주세요 : ");
		int month = sc.nextInt();
		
		sc.close();
	
		if(month < 13 && month > 0) {
			if(month == 12 || month == 1 || month == 2) {
				System.out.println("겨울입니다.");
			} else if(month == 3 || month == 4 || month == 5) {
				System.out.println("봄입니다.");
			} else if(month == 6 || month == 7 || month == 8) {
				System.out.println("여름입니다.");
			} else if(month == 9 || month == 10 || month == 11) {
				System.out.println("가을입니다.");
			}
		} else {
			System.out.println("입력오류가 발생했습니다.");
		}
		
	}
	
}
