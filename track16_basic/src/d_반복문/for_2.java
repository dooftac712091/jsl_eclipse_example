package d_반복문;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class for_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i += 1) {
			
			System.out.print("수를 입력해주세요(0을 입력하면 종료) : ");
			
			int num = sc.nextInt();
			
			if(num == 0) break;
			
			sum += num;
		}

		System.out.println("총합 : " + sum);
		
	}

}
