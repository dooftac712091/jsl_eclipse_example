package d_반복문;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class for_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작할 번호를 입력해주세요 : ");
		int startNumber = sc.nextInt();
		System.out.print("종료할 번호를 입력해주세요 : ");
		int endNumber = sc.nextInt();
		
		sc.close();
		
		if(startNumber > endNumber) {
			for(int i = startNumber; i >= endNumber; i--) {
				System.out.println(i);
			}
		} else if (startNumber < endNumber) {
			for(int i = startNumber; i <= endNumber; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("잘못된 값이 입력되었습니다.");
		}
	}

}
