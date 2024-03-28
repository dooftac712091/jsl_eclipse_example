package e_배열;

import java.util.Scanner;

public class Array_8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 인원 수를 입력해주세요 : ");
		int personnel = sc.nextInt();
		
		System.out.print("입력할 과목 수를 입력해주세요 : ");
		int score = sc.nextInt();
		
		String[][] info = new String[personnel][score + 2];
		
		for(int i = 0; i < info.length; i += 1) {
			int total = 0;
			int everage = 0;
			
			for(int j = 0; j < info[i].length - 2; j += 1) {
				System.out.printf("%d번째 인원의 %d번째 과목 점수를 입력해주세요 : ", (i + 1), (j + 1));
				info[i][j] = sc.next();
				total = Integer.parseInt(info[i][j]);
			}
			
			everage = total / score;
			info[i][score] = Integer.toString(total);
			info[i][score + 1] = Integer.toString(everage);
		}
		
		for(int i = 0; i < info.length; i += 1) {
			for(int j = 0; j < info[i].length - 1; j += 1) {
				System.out.print("==");
			}
		}
		
		System.out.println("");
				
		for(int i = 0; i < info.length; i += 1) {
			for(int j = 0; j < info[i].length; j += 1) {
				System.out.print(info[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
