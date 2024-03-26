package b_if;

import java.util.InputMismatchException;
import java.util.Scanner;

public class if_7 {
	
	int getCareer() {
		
		int career = 0;
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("직업을 입력해주세요 (학생:1, 주부:2, 회사원:3) : ");
			career = sc.nextInt();
			
			sc.close();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		
		return career;
	}
	
	public static void main(String[] args) {
		
		int career = 0;
		int fund = 0;
		double interest = 0;
		double result = 0;
		
		if_7 if7 = new if_7();
		
		career = if7.getCareer();
		
		if(career == 1 || career == 2 || career == 3) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("입금할 금액을 입력해주세요 : ");
			fund = sc.nextInt();
			
			sc.close();
			
			if(career == 1) {
				interest = fund * 1.2;
				result = fund += interest;
			} else if (career == 2) {
				interest = fund * 1.1;
				result = fund += interest;
			} else if (career == 3) {
				interest = fund * 1.05;
				result = fund += interest;
			}
			
			System.out.printf("만기금액 : %.1f원", result);
			System.out.printf("이자 : %.1f원", interest);
			
		} else {
			System.out.println("입력오류가 발생했습니다.");
		}
			
	}
}
