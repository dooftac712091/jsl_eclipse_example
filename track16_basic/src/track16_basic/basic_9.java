package track16_basic;

import java.util.Scanner;

public class basic_9 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int kor = 0;
		int mat = 0;
		int eng = 0;
		int total = 0;
		
		String name;
		
		System.out.print("お名前を入力してください：");
		name = sc.next();
		double major = 3.0;
		System.out.println("入力する科目の数は三つです。");
		System.out.print("国語の点数を入力してください：");
		kor = sc.nextInt();
		System.out.print("数学の点数を入力してください：");
		mat = sc.nextInt();
		System.out.print("英語の点数入力してください：");
		eng = sc.nextInt();
		
		total = kor + mat + eng;
		double everage = total / major;
		
		System.out.println(name + "さんの総点：" + total);
		// String.format에서는 %.2f와 같은 방식으로 소수점을 표현을 제한
		System.out.printf("%sさんの平均：%.2f", name, everage);
		
		sc.close();
	}
}
