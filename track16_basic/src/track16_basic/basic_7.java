package track16_basic;

import java.util.Scanner;

public class basic_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor = 0;
		int mat = 0;
		int total = 0;
		
		System.out.print("お名前を入力してください：");
		String name = sc.next();
		System.out.println(name + "さん、おはようございます。");
		
		System.out.print("国語の点数を入力してください：");
		kor = sc.nextInt(); 
		
		System.out.print("数学の点数を入力してください：");
		mat = sc.nextInt(); 
		
		total = kor + mat;
		
		System.out.println(name + "さんの総点：" + total);
		System.out.println(name + "さんの平均：" + total / 2);
		
		sc.close();

	}
}
