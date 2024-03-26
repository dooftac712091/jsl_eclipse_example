package b_if;

import java.util.Scanner;

public class if_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// int repeat;
		double everage;
		char grade = 0;
		
		System.out.print("평균 몇 점? : ");
		
		everage = sc.nextDouble();
		
		if(everage > 100 || everage < 1) {
			System.out.println("입력된 값이 잘못되었습니다.");
		}
		
		if(everage <= 100 && everage >= 90) {
			grade = 'A';
		} else if(everage <= 89 && everage >= 80) {
			grade = 'B';
		} else if(everage <= 79 && everage >= 70) {
			grade = 'C';
		} else if(everage <= 69 && everage >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		if(everage >= 90) {
			grade = 'A';
		} else if(everage >= 80) {
			grade = 'B';
		} else if(everage >= 80) {
			grade = 'C';
		} else if(everage >= 80) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		
		
		System.out.printf("당신의 등급은 %c입니다.", grade);
		
		sc.close();
	}
}
