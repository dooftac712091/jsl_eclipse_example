package b_if;

import java.util.Scanner;

public class if_2 {

	public static void main(String[] args) {
		
		String code = "10";
		System.out.println(code.equals("10"));
		
		int basic = 100;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("성별(택일)\n"
				+ "남 : 1, 여 : 2\n"
				+ "입력해주세요 : ");
		
		int gender = sc.nextInt();
		
		if(gender == 1) {
			System.out.println("안녕");
		}
		
		while(true) {
			
			if(gender == 1) {
				basic += 30;
				break;
			} else if(gender == 2) {
				basic += 50;
				break;
			} else {
				System.out.printf("성별(택일)\n"
						+ "남 : 1, 여 : 2\n"
						+ "입력해주세요 : ");
				gender = sc.nextInt();
			}
		}
		
		System.out.print("나이 : ");
		String age = sc.next();
		
		while(true) {
			if(Integer.parseInt(age) > 20) {
				basic += 20;
				break;
			} else if(Integer.parseInt(age) < 20 ) {
				break;
			} else {
				System.out.print("나이 : ");
				age = sc.next();
			}
		}
		
		System.out.printf("당신의 급여 : %d", basic);
		
		sc.close();
	}
}
