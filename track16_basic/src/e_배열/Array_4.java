package e_배열;

import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원의 수를 입력해주세요 : ");
		int capacity = sc.nextInt();
		
		String[] people = new String[capacity];
		
		for(int i = 0; i < people.length; i++) {
			System.out.printf("%d번째 인원의 성명을 입력해주세요 : ", (i + 1));
			people[i] = sc.next();
		}
		
		for(int j = 0; j < people.length; j++) {
			System.out.printf("%d : %s\n", (j + 1), people[j]);
		}
		
		System.out.print("검색할 이름의 키워드를 입력해주세요 : ");
		String keyword = sc.next();
		
		int searches = 0;
		
		for(int k = 0; k < people.length; k++) {
			if(people[k].contains(keyword)) {
				searches++;
			}
		}
		
		String[] searchArr = new String[searches];
		int searchPoint = 0;
		
		for(int m = 0; m < people.length; m++) {
			if(people[m].contains(keyword)) {
				searchArr[searchPoint++] = people[m];
			}
		}

	}
}
