package e_배열;

import java.util.Scanner;

public class Array_10_이승호 {
	
	// 첫 번째 질문 : 성명?
	// 1번째 점수 :
	// 2번째 점수 :
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 배열에 들어가는 의미의 데이터 (점수를 제외한 다른 데이터)의 삽입 수
		 */
		int additionalValue = 1; // 이름
		
		System.out.print("입력할 인원 수를 입력해주세요 : ");
		int personnelCount = sc.nextInt();
		System.out.print("입력할 과목의 수를 입력해주세요 : ");
		int majorCount = sc.nextInt();
		
		String[][] personnel = new String[personnelCount][majorCount + additionalValue];
		
		double [] grade = new double[personnelCount];
		
		for(int i = 0; i < personnel.length; i++) {
			int everage = 0;
			for(int j = 0; j < personnel[i].length; j++) {
				if(j == 0) {
					System.out.print("인원의 이름을 입력해주세요 : ");
					personnel[i][j] = sc.next();
				} else {
					System.out.print("입력할 " + j + "번째 과목의 점수를 입력해주세요 : ");
					personnel[i][j] = sc.next();
					everage += Integer.parseInt(personnel[i][j]);
				}
			}
			grade[i] = everage / majorCount;
		}
		
		sc.close();
		
		System.out.println("========== 출력 ==========");
		
		for(int i = 0; i < personnel.length; i++) {
			for(int j = 0; j < personnel[i].length; j++) {
				System.out.print(personnel[i][j] + " ");
			}
			String gradeName = "";
			
			if(grade[i] >= 90) {
				gradeName = "수";
			} else if(grade[i] >= 80) {
				gradeName = "우";
			} else if(grade[i] >= 70) {
				gradeName = "미";
			} else if(grade[i] >= 60) {
				gradeName = "양";
			} else {
				gradeName = "가";
			}
			
			System.out.println(gradeName);
		}
	}
}
