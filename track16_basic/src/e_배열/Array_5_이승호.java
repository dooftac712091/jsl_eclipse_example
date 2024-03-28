package e_배열;

import java.util.Scanner;

public class Array_5_이승호 {
	
	// 몇 과목인지 Input
	// 과목 수 만큼 받음, (1, 2, 3... 번째 과목의 점수를 입력해주세요 : )
	// 출력 : 60, 70, 80
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 과목을 입력하는지 입력해주세요 : ");
		int majorCount = sc.nextInt();
		
		String[] major = new String[majorCount + 1];
		
		int[] score = new int[majorCount + 1];
		
		int sum = 0;
		
		for(int i = 0; i < major.length; i++) {
			if(i != major.length - 1) {
				System.out.printf("%d번째 과목의 이름을 입력해주세요 : ", (i + 1));
				major[i] = sc.next();
				System.out.printf("%s의 점수를 입력해주세요 : ", major[i]);
				score[i] = sc.nextInt();
				sum += score[i];
			} else {
				major[i] = "총점";
				score[i] = sum;
			}
			
		}
		
		sc.close();
		
		for(int j = 0; j < major.length; j++) {
			for(int l = 0; l < major[j].length(); l++) {
				System.out.print("====");
			}
		}
		
		System.out.println("");
		
		for(int k = 0; k < major.length; k++) {
			System.out.printf("%s\t", major[k]);
		}
		
		System.out.println("");
		
		for(int j = 0; j < major.length; j++) {
			for(int l = 0; l < major[j].length(); l++) {
				System.out.print("====");
			}
		}
		
		System.out.println("");
		
		for(int k = 0; k < score.length; k++) {
			System.out.printf("%s\t", score[k]);
		}
		
		
		
	}

}
