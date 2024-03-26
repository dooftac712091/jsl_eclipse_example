package c_switch;

import java.util.Scanner;

public class switch_1 {
	
	enum Kisetsu {
		봄, 여름, 가을, 겨울;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 월인지 입력해주세요 : ");
		String month = sc.next();
		
		String season = "";
		
		switch(Integer.parseInt(month)) {
			case 12 : case 1 : case 2 : 
				season = Kisetsu.겨울.toString();
				break;
			case 3 : case 4 : case 5 : 
				season = Kisetsu.봄.toString();
				break;
			case 6 : case 7 : case 8 : 
				season = Kisetsu.여름.toString();
				break;
			case 9 : case 10 : case 11 :
				season = Kisetsu.가을.toString();
				break;
			default :
				season = "잘못된 입력";
		}
		
		System.out.println(season + "입니다.");
	}
}
