package d_반복문;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class for_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 몇 단? : ");
		
		int state = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", state, i, (state * i));
		}
	}

}
