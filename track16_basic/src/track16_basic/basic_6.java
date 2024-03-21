package track16_basic;

import java.util.Scanner;

public class basic_6 {

	public static void main(String[] args) {
		
		Car sonata = new Car("ソナタ");
		Car grandeur = new Car("グランジャ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("お名前を入力してください：");
		String name = sc.next();
		System.out.println("お名前：" + name);
		
		System.out.print("お住まいの地域を入力してください：");
		String area = sc.next();
		System.out.println("お住まいの地域：" + area);
		
		sc.close();

	}

}
