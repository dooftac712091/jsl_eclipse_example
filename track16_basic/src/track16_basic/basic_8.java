package track16_basic;

import java.util.Scanner;

public class basic_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor = 0;
		int mat = 0;
		int eng = 0;
		int total = 0;
		
		String name;
		
		System.out.print("お名前を入力してください：");
		name = sc.next();
		System.out.print("国語の点数を入力してください：");
		kor = sc.nextInt();
		System.out.print("数学の点数を入力してください：");
		mat = sc.nextInt();
		System.out.print("英語の点数入力してください：");
		eng = sc.nextInt();
		
		total = kor + mat + eng;
		
		System.out.println(name + "さんの総点：" + total);

	}
}
