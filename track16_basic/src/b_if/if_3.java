package b_if;

import java.util.Scanner;

public class if_3 {

	public static void main(String[] args) {
		
		int basic = 100;
		
		String sex;
		
		int military;
		
		String married;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별을 입력해주세요(남, 여) : ");
		
		sex = sc.next();

		if(sex.equals("남")) {
			
			System.out.print("병역여부를 입력해주세요(군필 : 1, 미필 : 2) : ");
			
			military = sc.nextInt();
			
			if(military == 1) {
				basic += 30;
			} else if (military == 2) {
				basic += 0;
			} else {
				basic = 0;
			}
			
		} else if (sex.equals("여")) {
			
			System.out.print("혼인여부를 입력해주세요(기혼: Y, 미혼 : N) : ");
			
			married = sc.next();
			
			if(married.equals("Y")) {
				basic += 50;
			} else if(married.equals("N")) {
				basic += 10;
			} else {
				basic = 0;
			}
			
		} else {
			basic = 0;
		}
		
		// 만약에 남성일 경우 : 병역여부를 물어
		
		// 군필 : 30, 미필 : 0, 그 외 : basic = 0
		
		System.out.printf("당신의 급여는 %d만원 입니다.", basic);
		
		// 기혼 += 50, 미혼 += 10, 그 외 : basic = 0
	}
}
