package b_if;

import java.util.Scanner;

public class if_4 {

	public static void main(String[] args) {
		// 성별 : 남 = m, 여 = f
		// 체력지수 : 남자 > 75, 여자 > 65
		// 결과 : 남자 ? 정상 : 비정상, 여자 ? 정상 : 비정상
		
		String gender;
		String health;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별을 입력해주세요(남 : m, 여 : f) : ");
		gender = sc.next();
		
		if(!gender.equals("m") && !gender.equals("f")) {
			System.out.println("입력오류");
		} else {
			System.out.print("체력지수를 입력해주세요(정수값) : ");
			health = sc.next();
			
			if(Integer.parseInt(health) <= 0 && Integer.parseInt(health) >= 200) {
				System.out.println("입력오류");
			} else if(gender.equals("m") && Integer.parseInt(health) >= 75) {
				System.out.print("정상");
			} else if(gender.equals("f") && Integer.parseInt(health) >= 65) {
				System.out.print("정상");
			} else {
				System.out.println("비정상");
			}
		}
		
		sc.close();
		
//		if(gender.equals("m") || gender.equals("f")) {
//			System.out.print("체력지수를 입력해주세요(정수값) : ");
//			health = sc.nextInt();
//			
//			if(gender.equals("m") && health >= 75) {
//				System.out.print("정상");
//			} else if(gender.equals("f") && health >= 65) {
//				System.out.print("정상");
//			} else {
//				System.out.println("비정상");
//			}
//		} else {
//			System.out.print("입력오류");
//		}
		
		
//		if(gender.equals("m")) {
//			
//			System.out.print("체력지수를 입력해주세요(정수값) : ");
//			health = sc.nextInt();
//			
//			if(health >= 75) {
//				System.out.print("정상");
//			} else {
//				System.out.print("비정상");
//			}
//			
//		} else if (gender.equals("f")) {
//			
//			System.out.print("체력지수를 입력해주세요(정수값) : ");
//			health = sc.nextInt();
//			
//			if(health >= 65) {
//				System.out.print("정상");
//			} else {
//				System.out.print("비정상");
//			}
//			
//		} else {
//			System.out.print("입력오류");
//		}
		
	}
}
