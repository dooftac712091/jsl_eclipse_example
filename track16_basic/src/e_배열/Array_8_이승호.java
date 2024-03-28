package e_배열;

import java.util.Scanner;

public class Array_8_이승호 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 인원 수를 입력해주세요 : ");
		int personnel = sc.nextInt();
		
		String[] question = {"성명", "지역", "나이", "사상", "거주지"};
		
		String[][] info = new String[personnel][question.length];
		
		for(int i = 0; i < info.length; i += 1) {
			for(int j = 0; j < question.length; j += 1) {
				System.out.printf("%s(를)을 입력해주세요 : ", question[j]);
				info[i][j] = sc.next();
			}
		}
		
		sc.close();
		
		for(int i = 0; i < info.length; i += 1) {
			for(int j = 0; j < info[i][j].length(); j += 1) {
				System.out.print("-----");
			}
		}
		
		System.out.println("");
				
		for(int i = 0; i < info.length; i += 1) {
			for(int j = 0; j < info[i].length; j += 1) {
				System.out.print(info[i][j] + "\t");
			}
			System.out.println("");
		}
		
		for(int i = 0; i < info.length; i += 1) {
			for(int j = 0; j < info[i][j].length(); j += 1) {
				System.out.print("-----");
			}
		}
	}

}
