package d_반복문;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class For_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("구구단 몇 단(시작할 단수) : ");
			int startPoint = sc.nextInt();
			
			System.out.print("구구단 몇 단(종료할 단수) : ");
			int endPoint = sc.nextInt();
			
			sc.close();
			
			if(startPoint > endPoint) {
				for(int i = startPoint; i <= endPoint; i++) {
					for(int j = 1; j <= 9; j++) {
						System.out.printf("%d X %d = %d\n", i, j, (i * j));
					}
				}
			} else if(startPoint < endPoint) {
				for(int i = startPoint; i <= endPoint; i--) {
					for(int j = 1; j <= 9; j++) {
						System.out.printf("%d X %d = %d\n", i, j, (i * j));
					}
				}
			} else {
				System.out.println("입력에 오류가 발생했습니다.");
			}
			
			
			
		} catch(InputMismatchException e) {
			System.out.println("입력에 오류가 발생했습니다.");
			e.printStackTrace();
		}
		
	}

}
