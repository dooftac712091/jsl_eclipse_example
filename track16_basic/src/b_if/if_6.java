package b_if;

import java.util.InputMismatchException;
import java.util.Scanner;

public class if_6 {
	
	public int getSum() {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		try {
		
		System.out.printf("%s점수를 입력해주세요 : ", "국어");
		sum += sc.nextInt();
		System.out.printf("%s점수를 입력해주세요 : ", "영어");
		sum += sc.nextInt();
		System.out.printf("%s점수를 입력해주세요 : ", "수학");
		sum += sc.nextInt();
		
		sc.close();
		
		return sum;
		
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	public static void main(String[] args) {
		
		if_6 if6 = new if_6();
		
		int sum = if6.getSum();
		
		double everage = 0;
		double major = 3.0;
		char result = 0;
		
		everage = sum / major;
		
		if(everage <= 100 && everage >= 0) {
			if(everage >= 90) {
				result = 'A';
			} else if(everage >= 80) {
				result = 'B';
			} else if(everage >= 70) {
				result = 'C';
			} else if(everage >= 60) {
				result = 'D';
			} else {
				result = 'F';
			}
			
			System.out.println("===== 출력 =====");
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + everage);
			System.out.println("총점 : " + result);
			
		} else {
			System.out.println("입력오류입니다.");
		}
			
		
		
		
		
	}
}
