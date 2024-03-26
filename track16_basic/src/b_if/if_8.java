package b_if;

import java.util.InputMismatchException;
import java.util.Scanner;

public class if_8 {
	
	void getResult(String name, int grade, double everage) {
		
		if(grade >= 1 && grade <= 6) {
			System.out.printf("성명 : %s\n", name);
			System.out.printf("학년 : %d학년\n", grade);
			System.out.printf("평균 : %.1f\n", everage);
			
			if(grade >= 4 && everage >= 80) {
				System.out.printf("결과 : 합격");
				
			} else if(grade >= 1 && everage >= 70) {
				System.out.printf("결과 : 합격");
				
			} else {
				System.out.printf("결과 : 불합격");
			}
			
		} else {
			System.out.println("입력오류가 발생했습니다.");
		}
		
	}
	
	public static void main(String[] args) {
		
		int sum = 0;
		double everage = 0;
		double major = 3.0;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("이름을 입력해주세요 : ");
			String name = sc.next();
			
			System.out.print("학년을 입력해주세요 : ");
			int grade = sc.nextInt();
			
			System.out.print("국어점수를 입력해주세요 : ");
			sum += sc.nextInt();
			
			System.out.print("수학점수를 입력해주세요 : ");
			sum += sc.nextInt();
			
			System.out.print("영어점수를 입력해주세요 : ");
			sum += sc.nextInt();
			
			everage = sum / major;
			
			sc.close();
			
			if_8 if8 =  new if_8();
			
			if8.getResult(name, grade, everage);
			
		} catch (NumberFormatException e) {
			System.out.println("입력오류가 발생했습니다.");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("입력오류가 발생했습니다.");
			e.printStackTrace();
		}
		
	}
}
